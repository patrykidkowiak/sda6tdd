package com.sda;

public class Writer {
    public String sayHello(String name) {
        return name==null || "".equals(name) ? "Hello my friend!" : "Hello " + name + "!";
    }
}
