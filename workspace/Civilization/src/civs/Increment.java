package civs;

public class Increment 
{
	private int playerNum = 0; //total of all increments
	private final int INCREMENT; //constant variable (uninitialized)
	
	//constructor initializes final instance variable INCREMENT
	public Increment (int incrementValue) {
		INCREMENT = incrementValue; //initialize constant variable (once)
	} //end Increment constructor

	//add INCREMENT to total
	public void addIncrementToTotal()
	{
		playerNum += INCREMENT;
	}//end method addIncrementToTotal
	
	//return String representation of an Increment object's data
	public String toString()
	{
		return String.format("playerNum = %d", total);
		
	}//end method toIncrementString
}//end class Increment
