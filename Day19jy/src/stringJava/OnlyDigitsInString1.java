package stringJava;

public class OnlyDigitsInString1 
{

	public static void main(String[] args)
	{
		String s = "abc1abc";
		
		boolean count = true;
		
		for(int i = 0; i<s.length(); i++)
		{
			char ch = (s.charAt(i));
			if(ch<'0' || ch>'9')
			{
				count = false;
			}
		}
		if(count)
		{
			System.out.println("Only Digits");
		}
		else
		{
			System.out.println("not only digits");
		}
		

	}

}
