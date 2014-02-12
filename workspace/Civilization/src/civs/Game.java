package civs;
import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] arguments) 
	{
    	//int turnNum;
    	int playerNum;
    	//System.out.println("Enter the turn number"); 
    	//turnNum=in.nextInt(); 
    	System.out.println("Enter the number of civilizations to receive rewards");
    	playerNum=new Scanner(System.in).nextInt();
    
    	while (playerNum > 0) {
    		int roll1;
//    		int roll2;
    		
     		String awardDesc = null;
     		
    		Random generator = new Random(); 

    		roll1 = generator.nextInt(20) + 1;
//    		roll2 = generator.nextInt(20) + 1;
     		
    		if (roll1 >= 1 & roll1 <= 3) {
    			awardDesc = "Settlers";
				System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
				playerNum = playerNum - 1;
    			
    		} else if (roll1 >= 4 & roll1 <= 6) {
    			awardDesc = "Workers";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 == 7) {
    			awardDesc = "Soldiers - 1";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 == 8) {
    			awardDesc = "Soldiers - 2";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 == 9) {
    			awardDesc = "Soldiers - 3";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 == 10) {
    			awardDesc = "Soldiers - 4";
    	    	System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    	    	playerNum = playerNum - 1;
    	    	
    		} else if (roll1 == 11) {
    			awardDesc = "Soldiers - 5";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 == 12) {
    			awardDesc = "Soldiers - 6";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 >= 13 & roll1 <= 14) {
    			awardDesc = "Gold";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 >= 15 & roll1 <= 16) {
    			awardDesc = "Technology";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 == 17) {
    			awardDesc = "Policy";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 >= 18 & roll1 <= 19) {
    			awardDesc = "Hurry Production";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum - 1;
    			
    		} else if (roll1 == 20) {
    			awardDesc = "Extra round of bonuses";
    			System.out.println("Award for civilization " + (playerNum) + " is " + awardDesc);
    			playerNum = playerNum + 1;
    			
      		} //end if
    	} //end while
	}  //end main
} //end class game

//Next step would be to vary the results based on the number of turns in the game.

//to fix the extra round of bonus # issue, each option might need to know if the previous player num was lower than the current.  i.e. 2 then 3 then 2...should be aware of this.

//Could I use an array to store the names of civilizations?
//for example, String [] civName;  - declares the array variable.
//civName = new String[20];    - allocate the array (initially all zero)



