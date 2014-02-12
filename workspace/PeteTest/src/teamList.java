import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class teamList {
	public static void main(String[] arguments)
	{
		List<String> teamList = new LinkedList<String>();
		teamList.add ("Peter M");
		teamList.add ("Peter J");
		teamList.add ("Tammy");
		teamList.add ("Suzy");
		teamList.add ("Susan");
	
		java.util.Collections.shuffle(teamList);
		
		String[] chosen3 = new String [3];
		for (int i = 0; i < chosen3.length && teamList.size() > 0; i++) {
			chosen3[i] = teamList.remove(0);
		}

	}
	

}
