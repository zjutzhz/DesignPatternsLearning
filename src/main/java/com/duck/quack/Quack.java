package com.duck.quack;

/**
 * Created by zheng on 3/30/16.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
