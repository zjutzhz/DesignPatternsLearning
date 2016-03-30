package com.strategy.duck.fly;

/**
 * Created by zheng on 3/30/16.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket! ");
    }
}
