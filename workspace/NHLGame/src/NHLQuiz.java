     

import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;
 
/**
 * The NHLQuiz class contains a HashMap which is populated with actual data from the NHL.
 * The method playGame() will cause a random integer between 0 and 29 to be generated; this
 * number will be used to get information about a team. For example if "11" is generated and 
 * "11" is the index for the Vancouver Canucks in the HashMap, then a question (one of two
 * questions) will be displayed.
 * One of the questions will take the form: "Guess what year the Vancouver Canucks entered
 * the NHL?"
 * The other question will take the form: "Guess how many Stanley Cups the Vancouver Canucks have
 * won?"
 * The questions will be chosen randomly.
 * A successful run of this game is as follows:
 * - User runs the playGame() method.
 * - program randomly picks one of the 30 NHL teams.
 * - program randomly picks one of the two questions
 * - User answers the question.
 * - program tells the user whether they were correct or not.
 * This repeats five times. The program does not pick the same team more than once. (Therefore
 * each time playGame() is executed, the user gets exactly five questions asked about five different teams.)
 * At the end of the five questions, the program tells the user how many answers they got
 * right, in this format:
 * You scored 3 out of 5 for a total of 60%.
 * 
 * @author Ian Robbins
 * @version July 6 2012
 */
public class NHLQuiz
{
    private HashMap<String, HockeyTeam>teams; //HashMap to contain information about the hockey teams.
    private int[] randomArray;
    private ArrayList<Integer> randomArrayList;
    private int numberOfWrongAnswers;
    private int numberOfCorrectAnswers;
 
    

    /**
     * Constructor for objects of class NHLQuiz
     */
    public NHLQuiz()
    {
    }
    public void initializeGame(){
         teams = new HashMap<String, HockeyTeam>();
        randomArray = new int[30];
        randomArrayList = new ArrayList<Integer>();
        numberOfWrongAnswers = 0;
        numberOfCorrectAnswers = 0;
 
        teams.put("Vancouver Canucks", new HockeyTeam ("Vancouver", 1970, 0));
        teams.put("New York Rangers", new HockeyTeam ("New York", 1926, 4));
        teams.put("Pittsburg Penguins", new HockeyTeam ("Pittsburg", 1967, 3));
        teams.put("St. Louis Blues", new HockeyTeam ("St. Louis", 1967, 0));
        teams.put("Boston Bruins", new HockeyTeam ("Boston", 1924, 6));
        teams.put("Nashville Predators", new HockeyTeam ("Nashville", 1998, 0));
        teams.put("New Jersey Devils", new HockeyTeam ("New Jersey", 1974, 3));
        teams.put("Detroit Red Wings", new HockeyTeam ("Detroit", 1974, 11));
        teams.put("Philadelphia Flyers", new HockeyTeam ("Philadelphia", 1926, 2));
        teams.put("Chicago Blackhawks", new HockeyTeam ("Chicago", 1926, 4));
        teams.put("San Jose Sharks", new HockeyTeam ("San Jose", 1991, 0));
        teams.put("Phoenix Coyotes", new HockeyTeam ("Phoenix", 1979, 0));
        teams.put("Washington Capitals", new HockeyTeam ("Washington", 1974, 0));
        teams.put("Dallas Stars", new HockeyTeam ("Dallas", 1967, 1));
        teams.put("Ottawa Senators", new HockeyTeam ("Ottawa", 1992, 0));
        teams.put("Colorado Avalanche", new HockeyTeam ("Denver", 1979, 2));
        teams.put("Los Angeles Kings", new HockeyTeam ("Los Angeles", 1967, 1));
        teams.put("Buffalo Sabres", new HockeyTeam ("Buffalo", 1970, 0));
        teams.put("Florida Panthers", new HockeyTeam ("Sunrise", 1993, 0));
        teams.put("Tampa Bay Lightning", new HockeyTeam ("Tampa Bay", 1992, 1));
        teams.put("Calgary Flames", new HockeyTeam ("Calgary", 1972, 1));
        teams.put("Winnipeg Jets", new HockeyTeam ("Winnipeg", 1999, 0));
        teams.put("Minnesota Wild", new HockeyTeam ("St. Paul", 2000, 0));
        teams.put("Toronto Maple Leaves", new HockeyTeam ("Toronto", 1917, 13));
        teams.put("Anaheim Ducks", new HockeyTeam ("Anaheim", 1993, 1));
        teams.put("New York Islanders", new HockeyTeam ("Uniondale", 1972, 4));
        teams.put("Carolina Hurricanes", new HockeyTeam ("Raleigh", 1979, 1));
        teams.put("Edmonton Oilers", new HockeyTeam ("Edmonton", 1979, 5));
        teams.put("Montreal Canadiens", new HockeyTeam ("Montreal", 1917, 24));
        teams.put("Columbus Bluejackets", new HockeyTeam ("Columbus", 2000, 0));
         
    }
 
    public void playGame(){
        initializeGame();
        getArrayOfRandomInts(); 
        int count = 0;
        while (count < 5){
            int questionNumber = pickQuestion();
            getQuestions(questionNumber);
            count++;
        }
 
        goodBye();
    }
 
    /**
     * This method generates a static array of 30 numbers between 0 and 29 which have been shuffled into a random order. 
     * This is then put into an ArrayList, and the ArrayList is used to select which team data to use in the questions.
     * By using an ArrayList we can remove "teams" one by one from the shuffled (randomized) list of teams, by
     * using the ArrayList "remove()" method.
     */
    public void getArrayOfRandomInts()
    {
        Random r = new Random();
        int[]localRandomArray = new int[30];
        int max = 30;
 
        for (int i = 0; i < max; i++){
            localRandomArray[i] = i;
        }
        for (int i=localRandomArray.length-1; i > 0; i--){
            int rand = r.nextInt(29);
            int temp = localRandomArray[i];
            localRandomArray[i] = localRandomArray[rand];
            randomArrayList.add(localRandomArray[i]); //add the shuffled numbers to an ArrayList to take advantage of "remove" method.
            localRandomArray[rand] = temp;
 
        }
    }
 
    /**
     * given index number return team name.
     * We'll take a number (the next number) from the ever-diminishing list of teams to choose from, and 
     * use that number to pick a team name from. We'll take that team name from the HashMap. Before we can do that
     * though, we need to take the keys and put them into a set, so we have an index to use. The index number
     * (taken from the ever-diminishing ArrayList of index numbers, which represent team names) will be used
     * to select which Key (representing the team names) to use. 
     */
    public String getTeamName(int index)
    {
        Set <String> teamSet = teams.keySet();
        String[]teamArray;
        teamArray = new String[30];
        Iterator it = teamSet.iterator();
        for (String teamName : teamSet){
            int i = 0;
            while (it.hasNext()){
                for (i = 0; i < 30; i++){
                    teamArray[i] = it.next().toString();
                }
            }
        }
        return teamArray[index];
 
    }
 
    /**
     * Given the Name of the team, give the year that team joined the NHL.
     * Now that we have a team name, taken from the HashMap's key list, we can use the HashMap's "get" method
     * to return a HockeyTeam value, and then we can use the HockeyTeam's "getYearJoined" method to return
     * the actual year the Hockey Team joined the NHL. This information will be useful in one of the questions
     * (eg. Which year did the team join the NHL?)
     */
    public int getYearOfTeam(String teamName)
    {  
        HockeyTeam tempTeam = teams.get(teamName);
        int year = tempTeam.getYearJoined();
        return year;
    }
 
    public int getNumberOfCups(String teamName)
    {
        HockeyTeam tempTeam = teams.get(teamName);
        int cups = tempTeam.getCupsWon();
        return cups;
    }
 
    /** 
     * This method picks the first number in the shuffled array of numbers representing the index of the KeySet. It
     * then removes that number from the array, so that index number can't be used again.
     */
    public Integer pickARandomNumber()
    {
        int i = 0;
        int randomNumber = randomArrayList.get(i);
        randomArrayList.remove(i);
        return randomNumber;
 
    }
 
    /**
     * Ask questions. First question is of the form:
     * "Guess what year the Vancouver Canucks entered the NHL?"
     * "Guess how many Stanley Cups the Vancouver Canucks have won?"
     * @param questionNumber represents the toss of a coin, which is implemented in this
     * program by the code in the pickQuestion method.
     */
    public void getQuestions(int questionNumber)
 
    {
        int questionPick = questionNumber;
        int count = 0;
 
        Scanner s = new Scanner(System.in);
        int index = pickARandomNumber();
        String tempTeamName = getTeamName(index);
 
        if (questionPick == 0){
            System.out.println("Guess what year the " + tempTeamName + " entered the NHL?");
            System.out.println();
            int guess = s.nextInt();
            //find answer
            int yearAnswer = getYearOfTeam(tempTeamName);
            if (guess != yearAnswer){
                System.out.println("WRONG!!!!");
                numberOfWrongAnswers++;
            }
            else
            {
                System.out.println("Correct!");
                numberOfCorrectAnswers++;
                numberOfCorrectAnswers = numberOfCorrectAnswers;
            }
        }
        else {
 
            System.out.println("Guess how many Stanley Cups the " + tempTeamName + " have won?");
            int guess = s.nextInt();
            //find answer
            int cupsAnswer = getNumberOfCups(tempTeamName);
            if (guess != cupsAnswer){
                System.out.println("WRONG!!!!");
                numberOfWrongAnswers++;
            }
            else
            {
                System.out.println("Correct!");
                numberOfCorrectAnswers++;
                numberOfCorrectAnswers = numberOfCorrectAnswers;
            }
        }
 
    }
 
    public int pickQuestion()
    {
        Random x=new Random();
        int i=x.nextInt(2);
        return i;
    }
 
    public void goodBye(){
        double number = numberOfCorrectAnswers;
        double grade = ((number/5.0) * 100.0);   
        System.out.println("You scored " + numberOfCorrectAnswers + " out of 5 for a total of "  + grade + "%");
        System.out.println();
    }
}