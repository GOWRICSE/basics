package player;
import java.util.Scanner;
public class Set1_StringCheck 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i) != s2.charAt(i))
			{
				count++;
			}
		}
		if(count==1)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
		
		
	}
}