package com.strategy.game;

import com.strategy.game.weapon.KnifeBehavior;

/**
 * Created by zheng on 3/30/16.
 */
public class Troll extends Character {
    public Troll() {
        this.weapenBehavior = new KnifeBehavior();
    }
}
