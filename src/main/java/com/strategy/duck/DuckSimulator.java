package com.strategy.duck;

import com.strategy.duck.fly.FlyRocketPowered;
import com.strategy.duck.fly.FlyWithWings;
import com.strategy.duck.quack.Quack;

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
