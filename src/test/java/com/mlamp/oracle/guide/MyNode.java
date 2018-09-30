package com.mlamp.oracle.guide;

public class MyNode extends SingleNode<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }

    public static void main(String[] args) {
        MyNode mn = new MyNode(4);
        SingleNode node = mn;
        node.setData(23);
        Integer x = ((MyNode) node).getData();
        System.out.println(x);


        SingleNode nn = new MyNode(3);
        nn.setData(new Integer(23));
        System.out.println(((MyNode) nn).getData());
        nn.setData(23);
        System.out.println(((MyNode) nn).getData());
    }
}
