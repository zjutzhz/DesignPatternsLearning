package com.strategy.game;

import com.strategy.game.weapon.KnifeBehavior;

/**
 * Created by zheng on 3/30/16.
 */
public class King extends Character {
    public King() {
        this.weapenBehavior = new KnifeBehavior();
    }
}
