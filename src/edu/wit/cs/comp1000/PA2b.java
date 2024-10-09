package edu.wit.cs.comp1000;
import java.util.Scanner;
/**
 * Solution to the second part of the second programming assignment.
 * 
 * This code should prompt the user to input floats a b and c for the discriminant of the quadratic formula.
 * Once input, the code should be able to find whether there are two roots, one root if it is equal to zero, or if the roots are imaginary.
 * 
 * @author Holden Marnell
 */
public class PA2b {

	/**
	 * This will enable the program, prompting the user to input the numbers used for the conversion.
	 * 
	 * @param args
	 */
    public static void main(String[] args) {
    	// Opens a scanner and prompts the user to input floats a b and c.
        Scanner scanner = new Scanner(System.in);

        // Declaring variables a b and c
        System.out.print("Enter a b c: ");
        double a = scanner.nextFloat();
        double b = scanner.nextFloat();
        double c = scanner.nextFloat();

        // Finding d, which is the discriminant of the quadratic formula.
        double d = ((b*b) - 4*a*c);

        // Checks if the discriminant is greater than, equal too, or less than 0. Depending on this output, the code will either
        // declare the roots are imaginary, declare that there is only one root (variable e), or find that there is two roots that can be calculated.
        if(d < 0){
        	// Prints imaginary if d is less than 0.
            System.out.println("Roots: imaginary");
        } else if(d == 0){
        	// If d == 0, it will calculate a special equation to make variable e, which will then be output to the user as one root.
            double e = (-b/2*a);
            System.out.printf("Root: %.2f%n", e);
        } else if(d > 0){
        	// If d is greater than 0, the code will find the roots for both the positive and negative parts of the quadratic formula, and then sort them from smallest to greatest.
            double r1 = (-b + Math.sqrt(d))/(2*a);
            double r2 = (-b - Math.sqrt(d))/(2*a);
            System.out.printf("Roots: %.2f, %.2f%n", Math.min(r1, r2), Math.max(r1,r2));
        }
    }
}

