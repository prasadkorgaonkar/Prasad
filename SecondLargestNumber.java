package Array;

public class SecondLargestNumber 
{
		public static void main(String args[])
		{
			int arr[]= {45,67,100,94,80,60};
			int temp=0;
			for(int i=0;i<arr.length;i++)
			
				{
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]<arr[j])
						{
							temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
						}
						
					}
				}
						System.out.println(arr[1]);
		}
}

