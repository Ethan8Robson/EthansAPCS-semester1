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
	public static double toDegrees(double number) {
		// A call toDegrees converts an angle measure given in degrees into radians. 
		// The method accepts a double and returns a double.
		// The method should use 3.14159 as an approximation for pi.
		double answer = 0;
		answer = ;
		return answer;
	}

}
