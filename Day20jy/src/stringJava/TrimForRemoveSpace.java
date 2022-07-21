package stringJava;

public class TrimForRemoveSpace 
{

	public static void main(String[] args) 
	{
		String s1 = "abcfshsfhshghp";
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		String s3 = s2.toLowerCase();
		System.out.println(s3);
		
		String s4 = "  abcd  ";
		System.out.println(s4);
		System.out.println(s4.trim());
		

	}

}
