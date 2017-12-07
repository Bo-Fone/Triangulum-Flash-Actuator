/*
 This program is a simple tool to help players accurately use the Micro Jump Drive in EVE Online.
 
 While the distance between the player and the target is less or equal to 200 km, the player can use the Micro Jump Drive two times in succession to go through a route that forms an isosceles triangle, then make it to the face of the target.
 
 Author: Flinner
 Created by: Dec 06 2017
 
 Input: distance;
 Output: angle, gridAngle;
 */


//Import packages
import java.util.Scanner;

//Class declaration
public class TriangulumFlashActuator {
    //Program start
    public static void main(String[] args) {
        //Program title
        System.out.print("\n\n" +
                         "+----------------------------------------+\n" +
                         "|       Triangulum Flash Actuator        |\n" +
                         "+----------------------------------------+\n" +
                         "\n");
        //Repeat prompting for user to enter the distance between target and self, then printing results
        Scanner stdin = new Scanner(System.in);
        double distance;
        String resume;
        
        do {
            System.out.print("Enter the distance of your target in km: ");
            distance = stdin.nextDouble();
            IsoscelesTriangle triangulumFlash = new IsoscelesTriangle(100.0, distance);
            System.out.println("The angle to tilt your ship after aligning with the target is " + (int)triangulumFlash.getEqualAngles() + " degree.");
            System.out.print("Another target? (Y/N): ");
            stdin.nextLine();
            resume = stdin.nextLine();
            System.out.println("\n");
        } while (resume.toLowerCase().charAt(0) == 'y');
        
    }
    
}
