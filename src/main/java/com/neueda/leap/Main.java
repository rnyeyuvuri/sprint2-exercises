package com.neueda.leap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Greeter greeter = new Greeter();
        System.out.println(greeter.greet(System.getenv().getOrDefault("GREETER_NAME", "Sprint 1")));
        Thread.sleep(600_000);
    }
}
