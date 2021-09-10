package week2.day2;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 454;
		int temp = num;
		int remainder;
		int reverse = 0;
		while (num > 0) {
			remainder = num % 10;
			num = num / 10;
			reverse = (reverse * 10) + remainder;
		}
		if (reverse == temp) {
			System.out.println("The given num is a palindrome");
		} else {
			System.out.println("The given num is not a palindrome");
		}
	}

}
