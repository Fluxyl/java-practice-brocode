package tutorials;

import java.util.Random;

public class ScopeDiceRoller {
    
    ScopeDiceRoller() {
    }

    int roll(int boundNum) {
        Random random = new Random();
        return(random.nextInt(boundNum)+1);
    }
}
