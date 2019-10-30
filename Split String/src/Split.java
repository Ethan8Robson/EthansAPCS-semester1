/* Ethan Robson
 * Period 4
 * Use the split method to find the filling of sandwiches
 * 10/21/19 start date
 */

import java.util.*;

public class Split {

	public static void main(String[] args) {
		System.out.println(part1("applespineapplesbreadlettucetomatobaconmayohambreadcheese"));
		System.out.println(part1("applebreadapple"));
		System.out.println(part1("applebreadbreadbreadapple"));
		System.out.println(part2("apples pineapples bread lettuce tomato bacon mayo ham bread cheese"));
	}
	
	public static String part1(String sandwich) {
		if (sandwich.indexOf("bread") == -1) {
			return "Not a sandwich";
		}
		if (sandwich.indexOf("bread", sandwich.indexOf("bread")+5) == -1) {
			return "Not a sandwich";
		}
		String contents = "";
		String afterFirstBread = sandwich.substring(sandwich.indexOf("bread")+5);
		String[] insides = afterFirstBread.split("bread");
		for (int i = 0; i < insides.length-1; i++) {
			contents += insides[i];
		}
		return contents;
	}
	
	public static String part2(String sandwich) {
		String sandwichContent = "";
		String filling = part1(sandwich);
		String[] contents = filling.split(" ");
		for (int i = 0; i < contents.length; i++) {
			sandwichContent += contents[i];
		}
		return sandwichContent;
	}
}