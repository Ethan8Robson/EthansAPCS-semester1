
import java.util.*;
public class Hourglass {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("How big will your hourglass be?");
		int size = scan.nextInt();
		closer(size);
		top(size);
		for (int gap = 1; gap <= size/2; gap++) {
			System.out.print(" ");
		}
		System.out.println("||");
		bottom(size);
		closer(size);
		scan.close();
	}
	public static void top(int big) {
		for (int line = 1; line <= big/2; line++) {
			for (int space = 0; space < line; space++) {
				System.out.print(" ");
			}
			System.out.print("\\");
			for (int colon = 1; colon <= -2*line+10; colon++) {
				System.out.print(":");
			}
			System.out.println("/");
		}
	}
	public static void bottom(int big) {
		for (int line = 1; line <= big/2; line++) {
			for (int colon = 1; colon <= -2*line+10; colon++) {
				System.out.print(":");
			}
			for (int space = 0; space < line; space++) {
				System.out.print(" ");
			}
		}
	}
	public static void closer (int big) {
		System.out.print("|");
		for (int quote = 1; quote <= big; quote++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
}


