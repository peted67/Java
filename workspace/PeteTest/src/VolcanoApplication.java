import java.io.*;

class VolcanoApplication {
    public static void main(String[] arguments) {
       
    	VolcanoRobot dante = new VolcanoRobot("exploring", 5, 200, 510);  //calls the new volcano robot class and applies values to its variables.
        System.out.println("\ndante:");
//        dante.status = "exploring";  THIS IS HOW I USED TO SUPPLY VARIABLES TO THE ROBOT BUT WITH A CONSTRUCTOR I CAN PUT IT ALL IN THE BRACKETS
//        dante.speed = 2;
//        dante.temperature = 510;
        dante.showAttributes();
        
        System.out.println("Increasing speed to 3.");
        dante.speed = 8;
        dante.showAttributes();
        System.out.println("Changing temperature to 670.");
        dante.temperature = 670;
        dante.showAttributes();
        System.out.println("Checking the temperature.");
        dante.checkTemperature();
        dante.showAttributes();
        
        VolcanoRobot virgil = new VolcanoRobot("exploring", 3, 400, 676);
        System.out.println("\nvirgil:");
        //virgil.status = "exploring";
        //virgil.speed = 3;
        //virgil.temperature = 676.5;
        virgil.checkTemperature();
        virgil.showAttributes();
        }
    
}