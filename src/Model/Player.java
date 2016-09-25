package Model;

/**
 * Created by 204g01 on 19.09.2016.
 */
public class Player extends Creature {
    //Playerklasse
    //Variable Punkte unterscheidet Sie von der Monsterklasse
    private int punkte;

    public Player(String name,int hp,int attackPoints,int defensePoints,int punkte) {
        super();
        this.punkte = punkte;

    }

    public int getPunkte()
    {
        return punkte;
    }

    public void setPunkte(int punkte)
    {
        this.punkte = punkte;
    }

}
