package Model;

/**
 * Created by 204g01 on 19.09.2016.
 */
public abstract class Creature {
    //Abstrakte Oberklasse mit Variablen und get/set methoden
    private String name;
    private int hp,attackPoints,defensePoints;

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }
}
