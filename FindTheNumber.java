package Array;

public class FindTheNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 33, 4, 23, 45, 23, 56 };
		int a = 25;
		boolean isPresent = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				isPresent = true;
				break;
			}
		}
		if (isPresent) {
			System.out.println(a + " is Present");
		} else {
			System.out.println(a + " is not Present");
		}
	}
}
