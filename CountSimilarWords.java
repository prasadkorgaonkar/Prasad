package Array;

public class CountSimilarWords 
{
	public static void main(String[] args) 
	{
		String str= "India is my country, I love my India, I am from India, India is Great";
		String name= "India";
		int count= 0;
		String[] words = str.split("[, ]");
		
		for(int i=0; i<words.length; i++)
		{
			if(name.equals(words[i]))
			{
				count= count+1;
			}
		}
			System.out.println(count);
	}
}
