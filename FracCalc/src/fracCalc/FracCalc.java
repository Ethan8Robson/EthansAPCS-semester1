package fracCalc;

import java.util.*;

public class FracCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String decision = "";
		do {
			System.out.println("What do you want to input?");
			System.out.println(produceAnswer(scan.nextLine()));
			System.out.println("Do you want to quit? (Type \"quit\" to quit)");
			decision = scan.nextLine();
		} while (!decision.toUpperCase().equals("QUIT"));

		// TODO: Read the input from the user and call produceAnswer with an equation
		scan.close();
	}

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION. This function will be used to
	// test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated. For your program, this
	// will be the user input.
	// e.g. input ==> "1/2 + 3/4"
	//
	// The function should return the result of the fraction after it has been
	// calculated
	// e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) {
		String[] answer = input.split(" ");
		String operand1 = answer[0];
		String operand2 = answer[2];
		String operator = answer[1];
		int[] seperateFrac1 = numSplit(operand1);
		int[] seperateFrac2 = numSplit(operand2);
		return "whole:" + seperateFrac2[0] + " numerator:" + seperateFrac2[1] + " denominator:" + seperateFrac2[2];
	}
	public static int[] numSplit(String operand) {
		int[] intValue = {0, 0, 1};
		String[] frac = {"0", "1"};
		String[] wholePart = operand.split("_");
		if (wholePart.length == 2) {
			frac = wholePart[1].split("/");
			intValue[0] = Integer.parseInt(wholePart[0]);
		} else if (wholePart.length == 1 && wholePart[0].indexOf("/") != -1) {
			frac = wholePart[0].split("/");
		} else {
			intValue[0] = Integer.parseInt(wholePart[0]);
		}
		intValue[1] = Integer.parseInt(frac[0]);
		intValue[2] = Integer.parseInt(frac[1]);
		return intValue;
//	}
//	public static int[] toImproperFrac(int[]) {
//		return 0;
	}
}
