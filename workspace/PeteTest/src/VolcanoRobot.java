

class VolcanoRobot {
    String status; //because these variables are not defined in a method they are instance variables.
    int speed;
    int power;
    double temperature;
    //variables defined in the class, these are attributes that differentiate one object from another. 
    
    public VolcanoRobot (String in1, int in2, int in3, double in4) { //this is a basic constructor.  Which means you could create   
    	status = in1;
    	speed = in2;
    	power = in3;
    	temperature = in4;
    } 


	void checkTemperature ()  { //method - behavior of object, in this case it can check if temp is greater than 660.
    	//if the temp is greater than 660 it changes the values of two variables.
        if (temperature > 660)  {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes ()  {
        System.out.println ("Status: " + status);
        System.out.println ("Speed: " + speed);
        System.out.println ("Temperature: " + temperature);
    }
}
