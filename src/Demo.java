/**
 * Created by iWanjugu on 20/11/2015.
 */
public class Demo  {

    public static void main (String[] args){
        Player Irene = new Player();

        Irene.setUsername("Irene");
        System.out.println (Irene.getUsername());

        Irene.setUsername("Ir");
        System.out.println (Irene.getUsername());

        Irene.setUsername("45");
        System.out.println (Irene.getUsername());
    }
}
