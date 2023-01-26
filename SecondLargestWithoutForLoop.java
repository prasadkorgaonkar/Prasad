package Array;

import java.util.Arrays;

public class SecondLargestWithoutForLoop {
	public static void main(String[] args) {
		
		int arr []= {25,10,5,80,30,40};
		int n = arr.length;
		Arrays.sort(arr);
//		for(int i=0; i<arr.length; i++) {
//		System.out.println(arr[i]+" ");
//		
//		}
		System.out.print("Second Largest Number is: "+arr[n-2]);
	}
}
