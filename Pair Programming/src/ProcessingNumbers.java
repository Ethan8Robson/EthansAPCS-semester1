// Ethan Robson
// October 2, 2019
// Collaborative Programming Exercise

import java.util.*;

public class ProcessingNumbers {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		// Initializing variables and setting up code.
		System.out.print("How many numbers you want? ");
		int num = userInput.nextInt();
		System.out.print("Type in your first number. ");
		int first = userInput.nextInt();
		int sum = 0;
		int max = first;
		int min = first;
		int maxEven = -1;
		if (first%2 == 0) {
			maxEven = first;
			sum += first;
		}
		for (int i = 1; i<= num-1; i++) {
			// Loops the code, does all the math for sum and max/mins.
			System.out.print("Type in your next number. ");
			int input = userInput.nextInt();
			if (input>max) {
				max = input;
			}
			if (input<min) {
				min = input;
			}
			if (input%2 == 0) {
				int evenNum = input;
				sum += input;
				if (evenNum>maxEven) {
					maxEven = evenNum;
				}
			}
		}
		System.out.println("Sum of Evens: " + sum + "\nEven Max: " + maxEven + "\nMax: " + max + "\nMin: " + min);
		userInput.close();
	}
}


