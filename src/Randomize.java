import java.util.Random;

public class Randomize {

    public int randomize(int index){
        Random random = new Random();
        int rand = random.nextInt(index);
        return rand;
    }
}
