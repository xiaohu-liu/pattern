package com.mlamp.design.pattern.test;

import com.mlamp.design.pattern.creation.singleton.SingletonLock;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestClient {
    private static final Integer THREAD_NUM = 100;

    static class NewInstance implements Runnable {
        private String name;

        private CyclicBarrier barrier;//栏珊

        public NewInstance(CyclicBarrier barrier, String name) {
            super();
            this.barrier = barrier;
            this.name = name;
        }

        @Override
        public void run() {
            try {
                //做个延时
                TimeUnit.MILLISECONDS.sleep(1000 * (new Random()).nextInt(8));
                System.out.println(name + " 准备好了...");
                //barrier的await方法，在所有参与者都已经在此 barrier 上调用 await 方法之前，将一直等待。
                barrier.await();
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(name + "的实例的hashcode:" + SingletonLock.getInstance2().hashCode());
        }
    }

    /**
     * 测试类的主函数
     *
     * @param args
     */
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(THREAD_NUM, new Runnable() {
            @Override
            public void run() {
                System.out.println("--------------提示:所有线程都已经到达.可以执行开始获取单例了.--------------------");
            }
        });

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_NUM);

        for (int i = 0; i < THREAD_NUM; i++) {
            if (i < 10) {
                executor.submit(new NewInstance(barrier, "thread-0" + i));

            } else {
                executor.submit(new NewInstance(barrier, "thread-" + i));
            }
        }
        executor.shutdown();
    }
}
