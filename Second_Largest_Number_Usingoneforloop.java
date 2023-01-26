package Array;

public class Second_Largest_Number_Usingoneforloop {
	public static void main (String args[])
	{
	int arr[]= {1,7,3,4,5,6,2,10};
	int largest=arr[0];
	int Secondlargest=arr[1];
	
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			Secondlargest=largest;
			largest=arr[i];
		}
		else if (arr[i]>Secondlargest && arr[i]!=largest) {
			Secondlargest=arr[i];
		}
		
		}
	System.out.print(Secondlargest);
		
	}
}
