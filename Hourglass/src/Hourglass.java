// Ethan Robson
// October 21 2019
// Hourglass Program

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
		// Creating the top of the hourglass.
		String top = "";
		int oddEven = 0;
		if (big % 2 != 0) {
			oddEven++;
		}
		for (int line = 1; line < big/2 + oddEven; line++) {
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
		// Creating bottom half of the hourglass.
		String bottom = "";
		for (int line = big/2 + 1; line < big; line++) {
			for (int space = 0; space < big - line; space++) {
				bottom += " ";
			}
			bottom += "/";
			for (int colon = 0; colon < (line - (big - line)) ; colon++) {
				bottom += ":";
			}
			bottom += "\\\n";
		}
		System.out.print(bottom);
	}
	
	public static void closer (int big) {
		// Creating top and bottom closer part.
		String closer = "|";
		for (int quote = 1; quote <= big; quote++) {
			closer += "\"";
		}
		closer += "|\n";
		System.out.print(closer);
	}
	
	public static void middle (int big) {
		// Creating the middle section of the hourglass.
		String mid = "";
		for (int gap = 1; gap <= big/2; gap++) {
			mid += " ";
		}
		if (big%2 == 0) {
			mid += "||\n";
		}else {
			mid += "|||\n";
		}
		System.out.print(mid);
	}
}


