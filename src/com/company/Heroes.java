package com.company;

public class Heroes {
    private int health;
    private int damage;
    private int ability;

    public Heroes(int health, int damage, int ability) {
        this.health = health;
        this.damage = damage;
        this.ability = ability;

    }

    public Heroes(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getAbility() {
        return ability;
    }



}




