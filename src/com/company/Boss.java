package com.company;

public class Boss {
        private int health;
        private int damage;
        private String ability;

        public int getHealth () {
            return  health;
        }

    public void setHealth (int health) {
            this.health = health; }

    public void setDamage(int damage) {
            this.damage = damage;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
            this.ability = ability;
    }

    public int getDamage() {
        return damage;
    }
}
