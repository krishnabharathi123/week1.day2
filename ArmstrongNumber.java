package week2.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int original = 153;
		int rem;
		int calculated = 0;
		int i = original;
		while (i > 0) {
			rem = i % 10;
			calculated = calculated + (rem * rem * rem);
			i = i / 10;
		}
		if (original == calculated) {
			System.out.println("The given number " + original + " is an armstrong number");
		} else {
			System.out.println("The given number " + original + " is not an armstrong number");

		}
	}

}
