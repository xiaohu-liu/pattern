package com.mlamp.design.pattern.struct.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Sourceable proxy = new Proxy();
        proxy.method();
    }
}
