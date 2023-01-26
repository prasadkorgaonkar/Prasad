
package Array;

public class Ascending 
{
	public static void main(String args[])
	{
		int arr[]= {10,9,2,0,99,1};
		int temp=0;
		for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
					System.out.print(arr[i]+ ",");
			}
					System.out.println(" ");
					int size= arr.length;
					
	        	   System.out.println("Largest number = "+ arr[size-1]);
	        	   System.out.println("lowest number= "+ arr[0]);
	        	   System.out.println("2nd lowest number= "+ arr[1]);
	        	   System.out.print("2nd largest number= "+ arr[size-2]);
	}
}