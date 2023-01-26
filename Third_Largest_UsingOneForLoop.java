package Array;

public class Third_Largest_UsingOneForLoop {
	public static void main (String args[])
	{
	int arr[]= {10,7,3,4,5,6,8,2,12,50,60};
	int largest=arr[0];
	int Secondlargest=arr[1];
	int thirdLargest=arr[2];
	
	for(int i=3;i<arr.length;i++)
	{
		if(arr[i]>largest && arr[i]>Secondlargest)
		{
			thirdLargest=Secondlargest;
			Secondlargest=largest;
			largest=arr[i];
		}
		else if (arr[i]>thirdLargest && arr[i]>Secondlargest && arr[i]!=largest) {
			thirdLargest=arr[i];
		}
		
		}
	System.out.print(thirdLargest);
		
	}
}

