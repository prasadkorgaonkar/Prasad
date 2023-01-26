package Array;

public class EvenNumber 
{
	public static void main(String[] args) 
	{
		int arr[]= {10,33,4,23,45,23,56};
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
