package stringJava;

public class OnlyDigitsInString
{

	public static void main(String[] args)
	{
		String s = "1234";
		
		int nonDigitCharCount = 0;
		
		for(int i = 0; i<s.length(); i++)
		{
			char ca = (s.charAt(i));
			
			if(ca<'0' || ca>'9')
			{
				nonDigitCharCount++;
			}
		}
		if(nonDigitCharCount == 0)
		{
			System.out.println("Only Digits");
		}
		else
		{
			System.out.println("not only digits");
		}
		

	}

}
