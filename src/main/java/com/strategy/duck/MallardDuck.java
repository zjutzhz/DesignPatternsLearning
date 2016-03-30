package com.strategy.duck;

import com.strategy.duck.fly.FlyWithWings;
import com.strategy.duck.quack.MuteQuack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a Mallard duck!");
    }
}