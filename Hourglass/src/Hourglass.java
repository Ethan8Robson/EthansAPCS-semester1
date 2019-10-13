
import java.util.*;

public class Hourglass {
	
	public static void main(String[] args) {
		String decision = "";
		Scanner scan = new Scanner (System.in);
		do {
			System.out.println("How big will your hourglass be?");
			int size = scan.nextInt();
			closer(size);
			top(size);
			middle(size);
			bottom(size);
			closer(size);
			System.out.println("Do you want to continue? Type quit to exit.");
			decision = scan.next();
		} while (!decision.toUpperCase().equals("QUIT"));
		scan.close();
	}
	
	public static void top(int big) {
		String top = "";
		for (int line = 1; line < big/2; line++) {
			for (int space = 0; space < line; space++) {
				top += " ";
			}
			top += "\\";
			for (int colon = 1; colon <= -2*line+big; colon++) {
				top +=":";
			}
			top += "/\n";
		}
		System.out.print(top);
	}
	
	public static void bottom(int big) {
		String bottom = "";
		for (int line = 1; line < big/2; line++) {
			for (int space = 1; space <= (big-line)-(big/2); space++) {
				bottom += " ";
			}
			bottom += "/";
			for (int colon = 1; colon <= line*2; colon++) {
				bottom += ":";
			}
			bottom += "\\\n";
		}
		System.out.print(bottom);
	}
	
	public static void closer (int big) {
		String closer = "|";
		for (int quote = 1; quote <= big; quote++) {
			closer += "\"";
		}
		closer += "|\n";
		System.out.print(closer);
	}
	
	public static void middle (int big) {
		String mid = "";
		for (int gap = 1; gap <= big/2; gap++) {
			mid += " ";
		}
		mid += "||\n";
		System.out.print(mid);
	}
}


