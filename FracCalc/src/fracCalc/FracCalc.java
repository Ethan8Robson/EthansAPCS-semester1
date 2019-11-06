package fracCalc;

import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String decision = "";
    	do {
    		System.out.println("What do you want to input?");
        	System.out.println(produceAnswer(scan.next()));
        	System.out.print("Do you want to quit? (Type \"quit\" to quit)");
        	decision = scan.next();
    	} while (!decision.toUpperCase().equals("QUIT"));
    	
        // TODO: Read the input from the user and call produceAnswer with an equation
    	scan.close();
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
    	String[] answer = input.split(" ");
    	String operand1 = answer[0];
    	String operand2 = answer[2];
    	String operator = answer[1];
    	int wholeNum2 = 0;
        int numerator2 = 0;
        int denominator2 = 0;
    	String[] wholePart2 = operand2.split("_");
    	String[] frac2 = {"0", "1"};
    	if (wholePart2.length == 2) {
    		frac2 = wholePart2[1].split("/");
    		wholeNum2 = Integer.parseInt(wholePart2[0]);
    	} else if (wholePart2.length == 1 && wholePart2[0].indexOf("/") != -1) {
    		frac2 = wholePart2[0].split("/");
    	} else {
    		wholeNum2 = Integer.parseInt(wholePart2[0]);
    	}
    	numerator2 = Integer.parseInt(frac2[0]);
    	denominator2 = Integer.parseInt(frac2[1]);
        return "whole:" + wholeNum2 + " numerator:" + numerator2 + " denominator:" + denominator2;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
