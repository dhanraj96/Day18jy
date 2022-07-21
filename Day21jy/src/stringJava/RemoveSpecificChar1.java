package stringJava;

public class RemoveSpecificChar1 
{

	public static void main(String[] args) 
	{
		String s1 = "abcdef";
		String s2 = "";
		char ch1 = 'f';
		char[] ch = s1.toCharArray();
		
		for(int i = 0; i<ch.length; i++)
		{
			if(ch[i] != ch1)
			{
				s2 = s2+ch[i];
			}
		}
		System.out.println(s2);
		
		

	}

}
