package com.strategy.game;

import com.strategy.game.weapon.BowAndArrowBehavior;

/**
 * Created by zheng on 3/30/16.
 */
public class Knight extends Character {
    public Knight() {
        this.weapenBehavior = new BowAndArrowBehavior();
    }
}
