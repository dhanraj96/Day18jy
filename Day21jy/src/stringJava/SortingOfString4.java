package stringJava;

public class SortingOfString4
{

	public static void main(String[] args)
	{
		String[] sa = {"Dhanraj","Shivraj","Shubham","Aniket","Madan","Rameshwar"};
		
		for(int i = 0; i<sa.length; i++)
		{
			for(int j = i+1; j<sa.length; j++)
			{
				if(sa[i].compareToIgnoreCase(sa[j])>0)
				{
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
			}
		}
		for(int k = 0; k<sa.length; k++)
		{
			System.out.println(sa[k]);
		}
		
		

	}

}
