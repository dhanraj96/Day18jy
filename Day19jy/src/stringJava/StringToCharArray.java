package stringJava;

public class StringToCharArray 
{

	public static void main(String[] args) 
	{
		String s = "HefShine";
		
		char[] ca = s.toCharArray();
		
		for(int i = 0; i<ca.length; i++)
		{
			System.out.println(ca[i]);
		}
		

	}

}
