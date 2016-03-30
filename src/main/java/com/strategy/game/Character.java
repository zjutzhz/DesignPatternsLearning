package com.strategy.game;

import com.strategy.game.weapon.WeapenBehavior;

/**
 * Created by zheng on 3/30/16.
 */
public abstract class Character {
    WeapenBehavior weapenBehavior;

    public void setWeapenBehavior(WeapenBehavior wb) {
        this.weapenBehavior = wb;
    }


    public void fight() {
        weapenBehavior.useWeapon();
    }

}
