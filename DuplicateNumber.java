package Array;

public class DuplicateNumber 
{
	public static void main(String[] args) 
	{
		int arr[]= {6,2,4,10,8,4,6,1};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The duplicate number is "+ arr[j]);
				}
			}
		}
	}
}
