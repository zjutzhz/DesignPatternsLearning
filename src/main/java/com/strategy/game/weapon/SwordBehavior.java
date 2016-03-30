package com.strategy.game.weapon;

/**
 * Created by zheng on 3/31/16.
 */
public class SwordBehavior implements WeapenBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Use sword! ");
    }
}
