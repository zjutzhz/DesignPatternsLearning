package com.duck;

import com.duck.fly.FlyNoWay;
import com.duck.quack.MuteQuack;

/**
 * Created by zheng on 3/30/16.
 */
public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
    public  ModelDuck(){
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
}
