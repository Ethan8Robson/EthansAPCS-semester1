// Ethan Robson
// Started October 24, 2019
// Altering arrays with various methods

import java.util.*;

public class ArraysLab3 {

	public static void main(String[] args) {
		int [] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int [] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int appendNum = 200;
		int removeIdx = 5;
		System.out.println(Arrays.toString(sum(a1, a2)));
		System.out.println(Arrays.toString(append(a1, appendNum)));
		System.out.println(Arrays.toString(remove(a1, removeIdx)));
		System.out.println(sumEven(a1));
		rotateRight(a1);

	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			sum[i] = arr1[i] + arr2[i];
		}
		return sum;
	}
	public static int[] append(int[] arr, int num) {
		int[] newArr = Arrays.copyOf(arr, arr.length+1);
		newArr[arr.length] = num;
		return newArr;
	}
	public static int[] remove(int[] arr, int idx) {
		int [] tempArr = Arrays.copyOf(arr,  arr.length-1);
		for (int i = idx; i < tempArr.length; i++) {
			tempArr[i] = arr[i+1];
		}
		return tempArr;
	}
	public static int sumEven(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
	public static void rotateRight(int[] arr) {
		int lastNum = arr[arr.length-1];
		int temp = arr[0];
		int temp2 = arr[1];
		for (int i = 0; i < arr.length-2; i++) {
			arr[i+1] = temp;
			temp = temp2;
			temp2 = arr[i+2];
			
		}
		arr[arr.length-1] = temp;
		arr[0] = lastNum;
	}
}
