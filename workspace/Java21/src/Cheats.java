
import java.util.Random;

public class Cheats {
    public static void main(String[] arguments) {
    	//log("Determining awards for Civilizations using random number generation");
    	Random generator = new Random(); //Random is a class in the existing JAVA library.
    	int roll1;
    	roll1 = generator.nextInt(18);
    	System.out.println ("Roll result " + roll1);
    	String awardDesc = null;
    	if (roll1 >= 0 & roll1 <= 2) {
    		awardDesc = "Settlers";
    	} else if (roll1 >= 3 & roll1 <= 4) {
    		awardDesc = "Workers";
    	} else if (roll1 >= 5 & roll1 <= 6) {
    		awardDesc = "Soldiers";
    	} else if (roll1 >= 7 & roll1 <= 8) {
    		awardDesc = "Gold";
    	} else if (roll1 >= 9 & roll1 <= 11) {
    		awardDesc = "Technology";
    	} else if (roll1 >= 12 & roll1 <= 13) {
    		awardDesc = "Policy";
    	} else if (roll1 >= 14 & roll1 <= 16) {
    		awardDesc = "Hurry Production";
    	} else if (roll1 == 17) {
    		awardDesc = "Extra round of bonuses";
    	}
    	System.out.println("Award is " + awardDesc);
    }
}

//sample of comparing two values
//boolean extraLife = (score > 75000) || (playerLevel == 0);  
//This makes it true if either are met.

//boolean extraLife = (score > 75000) & (playerLevel == 0); 
//This makes it true only if both are met.

