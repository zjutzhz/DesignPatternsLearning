package com.duck;

import com.duck.fly.FlyWithWings;
import com.duck.quack.MuteQuack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a Mallard duck!");
    }
}