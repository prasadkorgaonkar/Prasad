package Array;

public class LowestNumber 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,33,4,23,70,23,56};
		int Min= arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<Min)
			{
				Min=arr[i];
			}
		}
			System.out.println(Min);
	}
}

