package Model;

/**
 * Created by 204g01 on 19.09.2016.
 */
public class Player extends Creature {
    private boolean tod;
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

    public boolean getTod(){return tod;}

    public void setTod(boolean tod) {
        this.tod = tod;
    }
}
