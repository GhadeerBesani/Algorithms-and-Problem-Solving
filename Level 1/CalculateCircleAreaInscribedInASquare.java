

/* Calculate Circle Area Inscribed in a Square using the following formula
Area = PHI*(A/2)^2
*/


import java.util.Scanner;

public class CalculateCircleAreaInscribedInASquare {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        final double PHI = 3.14;
        
        // Prompts the user to enter square side
        System.out.println("Enter square side:");
        double squareSide = input.nextDouble();
        
        // Calculate the area
        double area = (PHI * (squareSide * squareSide)) / 4;
        
        // Display the result
        System.out.println("the area is : " + area);
        
    }
    
}
