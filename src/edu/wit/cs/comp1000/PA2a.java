package edu.wit.cs.comp1000;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Solution to the first part of the second programming assignment.
 * 
 * This code should prompt the user to input 5 different whole numbers (Integers) at the same time, to which the system will store
 * in an array list and then calculate the sums and averages of the positive and negative numbers, as well as the two lists combined.
 * 
 * @author Holden Marnell
 */
public class PA2a {
	/**
	 * This will enable the program, prompting the user to input the 5 numbers used to calculate the sums and averages,
	 * as well as declare the arraylists and call the methods.
	 * 
	 * @param args
	 */
	
	// Declares the ArrayLists posnum and negnum
    static ArrayList<Integer> posnum = new ArrayList<>();
    static ArrayList<Integer> negnum = new ArrayList<>();

    public static void main(String[] args) {
    	// clears the ArrayLists after every use.
    	posnum.clear();
    	negnum.clear();
    	
    	// Calls the scanner method (method used to input the numbers and sort them)
    	// calls the sumandaverage method (method used to calculate the sum and averages of the numbers)
        scanner();
        sumandaverage();
    }

    // declares the method scanner.
    public static void scanner() {
    	//declares the scanner and asks the user to input 5 whole numbers, and after input they will be sorted out into negnum and posnum.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter five whole numbers: ");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            if (number > 0) {
                posnum.add(number);
            } else if (number <= 0) {
                negnum.add(number);
            }
        }
    };
    // declares the method sumandaverage.
    private static void sumandaverage() {
    	// declares variable sumPos, which is used to calculate the average of the positive numbers for every number in posnum.
        int sumPos = 0;
        for(int number : posnum) {
            sumPos += number;
        }
        // prints the output of sumPos
        System.out.println("The sum of the "+ posnum.size() + " positive " + (posnum.size() == 1 ? "number: " : "numbers: ") + sumPos);

    	// declares variable sumNeg, which is used to calculate the average of the negative numbers for every number in negnum.
        int sumNeg = 0;
        for(int number : negnum) {
            sumNeg += number;
        }
        // prints the output of negPos
        System.out.println("The sum of the "+ negnum.size() + " non-positive " + (negnum.size() == 1 ? "number: " : "numbers: ") + sumNeg);

        // Adds both of the sums together to get the total sum of the 5 numbers (sumTotal) and then prints it.
        int sumtotal = sumPos + sumNeg;
        System.out.println("The sum of the 5 numbers: " + sumtotal);

        // Takes the sum of all the positive numbers and divides it by the amount of numbers in posnum. If the output is "NaN", it will print out 0.00
        double avgPos = (double) sumPos / posnum.size();
        if(Double.isNaN(avgPos)) {
        	avgPos = 0.00;
        }
        // Prints the result.
        System.out.printf("The average of the "+ posnum.size() + " positive " + (posnum.size() == 1 ? "number: " : "numbers: ") + "%.2f%n", avgPos);

        // Takes the sum of all the negative numbers and divides it by the amount of numbers in negnum. If the output is "NaN", it will print out 0.00
        double avgNeg = (double) sumNeg / negnum.size();
        if(Double.isNaN(avgNeg)) {
        	avgNeg = 0.00;
        }
        // Prints the result.
        System.out.printf("The average of the "+ negnum.size() + " non-positive " + (negnum.size() == 1 ? "number: " : "numbers: ") + "%.2f%n", avgNeg);

        // Takes the sum of all the numbers and divides them by 5, if the result if "NaN" the output will be 0.00
        double avgTotal = (double) sumtotal / 5;
        if(Double.isNaN(avgTotal)) {
        	avgTotal = 0.00;
        }
        // Prints the result.
        System.out.printf("The average of the 5 numbers: %.2f%n", avgTotal);
    }
}
