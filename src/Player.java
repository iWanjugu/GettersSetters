/**
 * Created by iWanjugu on 20/11/2015.
 */
public class Player {
    private String username;
    private int level;
    private int score;
    private int lives;

    //Constructor with initializations
    public Player() {
        username = "";
        level = 0;
        score = 0;
        lives = 3;
    }

    //Setters
    public void setUsername (String name){
        
        boolean isInteger = isInteger(name);
        if (isInteger) {
            System.out.println("Fail.Name should have letters only");
        }
            else {
                if (name.length() < 3) {
                    System.out.println("Fail. Name has to be more than 2 letters");
                }
                else {
                    this.username  = name;
                }
            }
        }

    private boolean isInteger(String name) {
        boolean isValidInteger = false;
        try
        {
            Integer.parseInt(name);
            isValidInteger = true;
        }
        catch (NumberFormatException ex)
        {

        }

        return isValidInteger;
    }


    public void setLevel (int level){
        this.level  = level;
    }
    public void setScore (int score){
        this.score  = score;
    }
    public void setLives (int lives){
        this.lives  = lives;
    }

    // Getters
    public String getUsername (){
        return username;
    }
    public int getLevel (){
        return level;
    }
    public int getScore (){
        return score;
    }
    public int getLives (){
        return lives;
    }


}
