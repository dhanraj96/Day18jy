package stringJava;

public class ReverseStringArray 
{

	public static void main(String[] args) 
	{
		String s = "You are very very very good students";
		String[] sa = s.split(" ");
		for(int i = 0; i<sa.length; i++)
		{
			char[] ca = sa[i].toCharArray();
			int start = 0; 
			int end = ca.length-1;
			while(start<end)
			{
				char temp = ca[start];
				ca[start] = ca[end];
			    ca[end] = temp;
				start++;
				end--;
			}
			sa[i] = new String(ca);
			
		}
		for(int i = 0; i<sa.length; i++)
		{
			System.out.print(sa[i] +" ");
		}
		

	}

}
