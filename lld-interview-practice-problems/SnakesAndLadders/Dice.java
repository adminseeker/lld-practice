import java.util.Random;

public class Dice {
    public static Dice instance;
    public int diceRange;
    private Random random;

    private Dice(){
        this.diceRange=6;
        this.random=new Random();
    }
    public static Dice getInstance(){
        if(instance==null){
            instance=new Dice();
        }
        return instance;
    }

    public int roll(){
        return random.nextInt(diceRange)+1;
    }
}
