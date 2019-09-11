/* Ethan Robson
 * August 29, 2019
 * Period 4
 * Group of methods that perform math calculations (a library)
 */
public class Calculate {
	// A call to square returns the square of the value passed. 
	// The method accepts an integer and returns an integer.
	public static int square(int number) {
		int answer=0;
		answer = number*number;
		return answer;
	}
	public static int cube(int number) {
		// A call to cube returns the cube of the value passed. 
		// The method accepts an integer and returns an integer.
		int answer=0;
		answer = number*number*number;
		return answer;
	}
	public static double average(double number1, double number2) {
		// A call to average returns the average of the values passed to it. 
		// The method accepts 2 doubles and returns a double.
		double answer = 0;
		answer = (number1+number2)/2;
		return answer;
	}
	public static double average(double number1, double number2, double number3) {
		// A call to average returns the average of the values passed to it. 
		// The method accepts 3 doubles and returns a double.
		double answer = 0;
		answer = (number1+number2+number3)/2;
		return answer;
	}
	public static double toDegrees(double radian) {
		// A call toDegrees converts an angle measure given in degrees into radians. 
		// The method accepts a double and returns a double.
		double answer = 0;
		answer = radian*(180/3.14159);
		return answer;
	}
	public static double toRadians(double degree) {
		// A call toRadians converts an angle measure given in degrees into radians.
		// The method accepts a double and returns a double
		double answer = 0;
		answer = degree*(3.14159/180);
		return answer;
	}
	public static double discriminant(double number1, double number2, double number3) {
		//A call to discriminant provides te coefficients of a quadratic equation in standard form (a, b, and c) and returns the value of the discriminant
		// The method accepts three doubles and returns a double
		double answer = 0;
		answer = (number2*number2)-(4*number1*number3);
		return answer;
	}
	public static String toImproperFrac(int number, int numerator, int denominator) {
		// A call to toImproperFrac converts mixed number (with its pieces provided separately in the order whole number, numerator, then denominator) into an improper fraction.
		// The method accepts three integers and returns a String
		int answer = 0;
		answer = (number*denominator)+numerator;
		return answer + "/" + denominator;
	}
	public static String toMixedNum(int numerator, int denominator) {
		// A call to toMixedNum converts an improper fraction (with its pieces provided separately in the order numerator then denominator) into a mixed number.
		// The method accepts two integers and returns a String.
		int number = 0;
		int newnumerator = 0;
		number = (numerator/denominator);
		newnumerator = (numerator%denominator);
		return number + "_" + newnumerator + "/" + denominator;
	}
	public static String foil(int number1, int number2, int number3, int number4, String var) {
		// A call to foil converts a binomial multiplication of the form (ax + b)(cx + d) into a quadratic equation of the form ax^2 + bx + c
		// The method accepts four integers and a String and then returns a String.
		int ax = (number1*number3);
		int bx = ((number1*number4) + (number2*number3));
		int c = (number2*number4);
		return ((ax + var + "^2") + "+" + (bx + var) + "+" + c);
	}
	public static boolean isDivisibleBy(int num1, int num2) {
		// A call to isDivisibleBy determines whether or not one integer is evenly divisible by another.
		// The method accepts a double and returns a double
		if (num1%num2 == 0) {
			return true;
		}else {
			return false;
		}
	}
	public static double absValue(double num) {
		// A call to absValue returns the absolute value of the nunmber passed.
		// The method accepts a double and returns a double.
		if (num>=0) {
			return num;
		}else {
			num = num*-1;
			return num;
		}
	}
	public static double max(double num1, double num2) {
		// A call to max returns the larger of the values passed.
		// The method accepts two integers and returns an int.
		if  (num1 >= num2) {
			return num1;
		}else{
			return num2;
		}
	}
	public static double max(double num1, double num2, double num3) {
		// Overload to the max method. 
		// The method accepts three doubles and returns a double.
		double test1 = max(num1, num2);
		double test2 = max(num1, num3);
		if (test1 >= test2) {
			return test1;
		}else {
			return test2;
		}	
	}
	public static int min(int num1, int num2) {
		// A call to min returns the smaller of the values passed.
		// The method accepts two integers and returns an int.
		if (num1 <= num2) {
			return num1;
		}else {
			return num2;
		}
	}
	public static double round2(double num) {
		// A call to round2 rounds a double correctly to 2 decimal places and returns a double.
		num = (num*100)+0.5;
		num = (int)num;
		num = (double)num;
		num = num/100;
		return num;
	}
	public static double exponent(double num, int exponent) {
		// A call to exponent raises a value to a positive integer power. 
		// The method accepts a double and an integer and returns a double.
		double base = num;
		if (exponent > 0) {
			for (int n=1; n<exponent; n++) {
				num = num*base; }
		return num;
		}else {
			num = num/num;
			return num;
		}
	}
	public static int factorial(int num) {
		// A call to factorial returns the factorial of the value passed. 
		// The method accepts an integer and returns an integer.
		for (int n=1; n<num; n++) {
			//working on  this
		}
	}
}
