package stringJava;

public class ReplaceCharInString1 
{

	public static void main(String[] args) 
	{
		String s1 = "abcddefddghip";
		String s2 = "";
		
		for(int i = 0; i<s1.length(); i++)
		{
			if(s1.charAt(i) == 'd')
			{
				s2 = s2+'f';
			}
			else
			{
				s2 = s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
		

	}

}
