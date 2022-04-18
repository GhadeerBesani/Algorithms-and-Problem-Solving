
/*
Calculate Circle Area along the circumference using the following formula
Area = l^2/4.PHI

l=circumference
 */

import java.util.Scanner;

public class CalculateCircleAreaAlongTheCircumference {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        final double PHI = 3.14;
        
        // Prompts the user to enter the circumference
        System.out.println("Enter the circumference:");
        double circumference = input.nextDouble();
        
        // Calculate the area
        double area = (circumference * circumference) / (4 * PHI);
        
        // Display the result
        System.out.println("the area is : " + area);
        
    }
    
}
