package com.duck;

import com.duck.fly.FlyNoWay;
import com.duck.fly.FlyRocketPowered;
import com.duck.fly.FlyWithWings;
import com.duck.quack.Quack;

public class DuckSimulator

{
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        mallard.setQuackBehavior(new Quack());
        mallard.performQuack();
        mallard.display();

        System.out.println("");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
    }
}
