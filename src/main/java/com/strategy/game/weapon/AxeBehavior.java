package com.strategy.game.weapon;

/**
 * Created by zheng on 3/30/16.
 */
public class AxeBehavior implements WeapenBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Wielded an axe! ");
    }
}
