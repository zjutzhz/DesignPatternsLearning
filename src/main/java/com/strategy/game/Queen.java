package com.strategy.game;

import com.strategy.game.weapon.KnifeBehavior;

/**
 * Created by zheng on 3/30/16.
 */
public class Queen extends Character {
    public Queen() {
        this.weapenBehavior = new KnifeBehavior();
    }
}
