package week2.day2;

public class FrequencyOfArray {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			// System.out.println(count);

			if (arr[i] != -1) {
				System.out.println(arr[i] + " occured " + count + " times");
			}

		}
	}

}
