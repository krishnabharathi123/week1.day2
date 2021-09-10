package week2.day2;

import java.util.Arrays;

public class MisingElementInArray {

	public static void main(String[] args) {

		int arr[] = { 22, 23, 24, 26, 27, 28 };
		int j = 0;
		Arrays.sort(arr);
		System.out.println("****Sorted array****");
		for (int i = 0; i < arr.length; i++)

		{
			System.out.println(arr[i]);
		}

		for (int i = arr[0]; i <= arr[0] + arr.length - 1; i++) {
			if (i != arr[j]) {
				System.out.println("The missing array is " + i);
				break;
			}
			j = j + 1;
		}

	}
}
