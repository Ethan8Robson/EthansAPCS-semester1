
import java.util.Scanner;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide values for coefficients a, b, and c.");
		System.out.println("a:");
		double a = scan.nextDouble();
		System.out.println("b:");
		double b = scan.nextDouble();
		System.out.println("c:");
		double c = scan.nextDouble();
		String decription = QuadraticDescriber(a, b, c);
		System.out.println(description);
	}

}
