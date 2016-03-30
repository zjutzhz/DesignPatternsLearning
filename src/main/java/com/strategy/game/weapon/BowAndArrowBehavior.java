package com.strategy.game.weapon;

/**
 * Created by zheng on 3/30/16.
 */
public class BowAndArrowBehavior implements WeapenBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shoot an arrow! ");
    }
}
