package com.strategy.duck.fly;

/**
 * Created by zheng on 3/29/16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
