// Ethan Robson
// September 25, 2019
// Math work for quadratic describer.

public class Quadratic {
	public static String quadrDescriber(double a, double b, double c) {
		String direction = "";
		if (a>=0) {
			direction = "Up";
		}else {
			direction = "Down";
		}
		double vertexX = round2(-(b/(2*a)));
		double vertexY = round2((a*(vertexX*vertexX)) + (b*vertexX) + c);
		String vertex = ("(" + vertexX + ", " + vertexY + ")");
		String xInts = quadForm(a, b, c);
		double yInt = c;
		return "Description of the graph of:\n y = " + a + "x^2 + " + b + " x + " + c + "\n\nOpens: " + direction + "\nAxis of Symmetry: " + vertexX + "\nVertex: " + vertex + "\nx-intercept(s): " + xInts + "\ny-intercept: " + yInt;
	}
	public static double sqrt(double numToRoot) {
		// A call to sqrt returns an approximation of the square root of the value passes, rounded to two decimal places.
		// The method accepts a double and returns a double.
		if (numToRoot < 0) {
			throw new IllegalArgumentException("Number to root can't be zero!");
		}
		double sqrt = 0;
		for (double i=0; (i*i) <= numToRoot; i += 0.001) {
			sqrt = i;
		}
		return round2(sqrt); 
	}
	public static double discriminant(double number1, double number2, double number3) {
		//A call to discriminant provides the coefficients of a quadratic equation in standard form (a, b, and c) and returns the value of the discriminant
		// The method accepts three doubles and returns a double
		double answer = 0;
		answer = (number2*number2)-(4*number1*number3);
		return answer;
	}
	public static String quadForm(double a, double b, double c) {
		double root1 = 0;
		double root2 = 0;
		if (discriminant(a,b,c) < 0) {
			return "None";
		}else {
			root1 = round2((-b + sqrt(discriminant(a, b, c))) / (2*a));
			root2 = round2((-b - sqrt(discriminant(a, b, c))) / (2*a));
		}
		if (root1 == root2) {
			return root1 + "";
		}else {
			return root1 + ", " + root2;
			
		}
	}
	public static double round2(double num) {
		// A call to round2 rounds a double correctly to 2 decimal places and returns a double.
		if (num > 0) {
			num = (num*100)+0.5;
		    num = (int)num;
		    num = (double)num;
		    num = num/100;
		    return num;
		}else {
			num = ((num*-1)*100)+0.5;
		    num = (int)num;
		    num = (double)num;
		    num = num/100;
		    return (num*-1);
		}
	}
}
	


