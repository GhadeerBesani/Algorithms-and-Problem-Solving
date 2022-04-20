

/*
Calculate Circle Area Inscribed in an isosceles triangle using the following formula
area = PHI * ((b ^ 2) / 4) * ((2 * a - b) / 2 * a + b))

a = sides of equal length
b = the base
 */

import java.util.Scanner;


public class CalculateCircleAreaInscribedInAnIsoscelesTriangle {


    public static void main(String[] args) {
        // Create new Scanner object
        Scanner input = new Scanner(System.in);
        
        final double PHI = 3.14;
        
        // Prompts the user to enter sides of equal length 
        System.out.println("Enter the sides of equal length:");
        double sidesOfEqualLength = input.nextDouble();
        
        // Prompts the user to enter the base 
        System.out.println("Enter the base:");
        double base = input.nextDouble();
        
        // Calculate the area
        double area = PHI * ((base * base) / 4)* ((2 * sidesOfEqualLength - base)
                / (2 * sidesOfEqualLength + base));        
        
        // Display the result
        System.out.println("the area is : " + area);
    }
    
}
