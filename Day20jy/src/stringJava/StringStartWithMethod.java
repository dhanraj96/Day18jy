package stringJava;

public class StringStartWithMethod 
{

	public static void main(String[] args) 
	{ 
		String s1 = "aabcde";
		String s2 = "aab";
		
		System.out.println(s1.startsWith(s2));
		
		System.out.println(s1.startsWith("a", 1));// Index
		

	}

}
