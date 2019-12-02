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
		scan.close();
	}
	public static String produceAnswer(String input) {
		String[] answer = input.split(" ");
		String operand1 = answer[0];
		String operand2 = answer[2];
		String operator = answer[1];
		int[] seperateFrac1 = numSplit(operand1);
		int[] seperateFrac2 = numSplit(operand2);
		int[] returnAnswer = {0, 0, 0};
		toImproperFrac(seperateFrac1);
		toImproperFrac(seperateFrac2);
		reduceFrac(seperateFrac1);
		reduceFrac(seperateFrac2);
		if (operator.equals("*") == true) {
			returnAnswer = multiply(seperateFrac1, seperateFrac2);
		} else if (operator.equals("/") == true) {
			returnAnswer = divide(seperateFrac1, seperateFrac2);
		} else if (operator.equals("+") == true) {
			toComDen(seperateFrac1, seperateFrac2);
			returnAnswer = add(seperateFrac1, seperateFrac2);
		} else if (operator.equals("-") == true) {
			toComDen(seperateFrac1, seperateFrac2);
			returnAnswer = subtract(seperateFrac1, seperateFrac2);
		}
		reduceFrac(returnAnswer);
		toMixedNum(returnAnswer);
		if (returnAnswer[0] != 0) {
		    returnAnswer[1] = Math.abs(returnAnswer[1]);
		} else if (returnAnswer[0] == 0 && returnAnswer[2] < 0) {
			returnAnswer[1] *= -1;
		}
		returnAnswer[2] = Math.abs(returnAnswer[2]);
		if (returnAnswer[1] == 0 || returnAnswer[2] == 1) {
			return returnAnswer[0] + "";
		} else if (returnAnswer[0] == 0) {
			return returnAnswer[1] + "/" + returnAnswer[2];
		}
		return returnAnswer[0] + "_" + returnAnswer[1] + "/" + returnAnswer[2];
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
	}
	public static void toImproperFrac(int[] mixedNum) {
		if (mixedNum[0] >= 0) {
			mixedNum[1] = mixedNum[2] * mixedNum[0] + mixedNum[1];
		} else {
			mixedNum[1] = mixedNum[2] * mixedNum[0] - mixedNum[1];
		}
		mixedNum[0] = 0;
	}
	public static int[] multiply(int[] frac1, int[] frac2) {
		int[] product = {frac1[0], frac1[1]*frac2[1], frac1[2]*frac2[2]};
		return product;
	}
	public static int[] divide(int[] frac1, int[] frac2) {
		int[] quotient = {0, frac1[1]*frac2[2], frac1[2]*frac2[1]};
		return quotient;
	}
	public static int[] add(int[] frac1, int[] frac2) {
		int[] sum = {frac1[0]+frac2[0], frac1[1]+frac2[1], frac1[2]};
		return sum;
	}
	public static int[] subtract(int[] frac1, int[] frac2) {
		int[] difference = {frac1[0]-frac2[0], frac1[1]-frac2[1], frac1[2]};
		return difference;
	}
	public static void toComDen(int[] frac1, int[] frac2) {
		int tempVar = frac1[2]*frac2[2];
		frac1[1] = frac1[1]*frac2[2];
		frac2[1] = frac2[1]*frac1[2];
		frac1[2] = tempVar;
		frac2[2] = tempVar;
	}
	public static void reduceFrac(int[] frac) {
		int gcf = 1;
		for (int i = 1; i <= frac[2]; i++) {
			if (frac[1] % i == 0 && frac[2] % i == 0) {
				gcf = i;
			}
		}
		frac[1] = frac[1] / gcf;
		frac[2] = frac[2] / gcf;
	}
	public static void toMixedNum(int[] frac) {
		frac[0] = frac[1] / frac[2];
		frac[1] = (frac[1] % frac[2]);
	}
}
