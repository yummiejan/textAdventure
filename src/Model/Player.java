package Model;

/**
 * Created by 204g01 on 19.09.2016.
 */
public class Player extends Creature {
    private boolean tod;

    public Player(String name,int hp,int attackPoints,int defensePoints) {
        super();

    }
    public boolean getTod(){return tod}

    public void setTod(boolean tod) {
        this.tod = tod;
    }
}
