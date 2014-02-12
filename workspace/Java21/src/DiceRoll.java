

public class DiceRoll {
	private int die1;
	public void roll () {
		die1 = (int)(Math.random()*20);
	}
	public int getDie1 () {
		return die1;
	}
}
