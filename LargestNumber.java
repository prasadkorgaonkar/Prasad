package Array;

public class LargestNumber 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,33,4,23,70,50};
		int Max= arr[0];
		for(int i=1; i<arr.length; i++)
			{
				if(arr[i]>Max)
				{
					Max=arr[i];
				}
			}
				System.out.println(Max);
	}
}
