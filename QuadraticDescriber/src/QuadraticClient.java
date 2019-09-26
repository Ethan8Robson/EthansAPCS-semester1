
import java.util.Scanner;

public class QuadraticClient {

	public static void main(String[] args) {
		for (boolean i = true; i == true;) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Provide values for coefficients a, b, and c.");
			System.out.println("a:");
			double a = scan.nextDouble();
			System.out.println("b:");
			double b = scan.nextDouble();
			System.out.println("c:");
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
