/**
 * Created by iWanjugu on 20/11/2015.
 */
public class Enemy {
    private int hitpoints;
    private int lives;

    public Enemy() {
        hitpoints = 0;
        lives = 3;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }


}
