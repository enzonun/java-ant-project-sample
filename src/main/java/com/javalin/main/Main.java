package com.javalin.main;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world java 11 with ant");
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello World"))
                .start(7070);
    }
}