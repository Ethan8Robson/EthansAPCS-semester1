
import java.util.Scanner;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Quadratic Describer.");
		for (boolean i = true; i == true;) {
			System.out.println("Provide values for coefficients a, b, and c.");
			System.out.print("a:");
			double a = scan.nextDouble();
			System.out.print("b:");
			double b = scan.nextDouble();
			System.out.print("c:");
			double c = scan.nextDouble();
			String description = Quadratic.quadrDescriber(a, b, c);
			System.out.println(description);
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String decision = scan.next();
			if (decision.equals("quit")) {
				i = false;
				scan.close();
			}
		}
	}

}
