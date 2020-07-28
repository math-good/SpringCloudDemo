package org.example.CircuitBreaker;

import org.example.CircuitBreaker.command.QueryOrderIdCommand;

public class HystrixDemo {
    public static void main(String[] args) {
        Integer ret1 = new QueryOrderIdCommand("a").execute();
        Integer ret2 = new QueryOrderIdCommand("b").execute();
        Integer ret3 = new QueryOrderIdCommand("c").execute();

        System.out.println(ret1);
        System.out.println(ret2);
        System.out.println(ret3);
    }
}
