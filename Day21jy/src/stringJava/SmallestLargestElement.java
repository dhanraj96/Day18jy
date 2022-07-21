package stringJava;

public class SmallestLargestElement 
{

	public static void main(String[] args)
	{
		String s1 = "Welcome to the world of java";
		String[] sa = s1.split(" ");
		
		for(int i = 0; i<sa.length; i++)
		{
			for(int j = i+1; j<sa.length; j++)
			{
				if(sa[i].length()>sa[j].length())
				{
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
			}
		}
		System.out.println("Smallest : " +sa[0]);
		System.out.println("Largest : " +sa[sa.length-1]);
		

	}

}
