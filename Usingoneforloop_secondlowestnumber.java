package Array;

public class Usingoneforloop_secondlowestnumber {

	public static void main (String args[])
	{
	int a[]= {50,87,62,54,23,98};
	int lowest=a[1];
	int Secondlowest=a[0];
	
	for(int i=0;i<0;i++)
	{
		if(a[i]<lowest)
		{
			Secondlowest=lowest;
			lowest=a[i];
		}
		else if (a[i]<Secondlowest && a[i]!=lowest) {
			Secondlowest=a[i];
		}
		
		}
	System.out.println(Secondlowest);
	
		
	}
	

}
