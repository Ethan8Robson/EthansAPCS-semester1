/* Ethan Robson
 * August 29, 2019
 * Period 4
 * Call math methods from Calculate library
 * Client code or runner code
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(12));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(10, 20));
		System.out.println(Calculate.average(2, 4, 6));
		System.out.println(Calculate.toDegrees(2));
		System.out.println(Calculate.toRadians(360));
		System.out.println(Calculate.discriminant(2, 2, 2));
		System.out.println(Calculate.toImproperFrac(3,  1,  2));
		System.out.println(Calculate.toMixedNum(7,  2));
		System.out.println(Calculate.foil(2,  3,  6,  -7, "n"));
		System.out.println(Calculate.isDivisibleBy(11,  5));
		System.out.println(Calculate.absValue(-4));
		System.out.println(Calculate.max(5, 6));
		System.out.println(Calculate.max(8, 9, 6));
		System.out.println(Calculate.min(9,7));
		System.out.println(Calculate.round2(-17.23653));
		System.out.println(Calculate.exponent(3, 3));
		System.out.println(Calculate.factorial(0));
		System.out.println(Calculate.isPrime(7));
		System.out.println(Calculate.gcf(12, 17));
		System.out.println(Calculate.sqrt(10));
		System.out.println(Calculate.quadForm(2,  4,  -9));
		
		
		
		
	}

}