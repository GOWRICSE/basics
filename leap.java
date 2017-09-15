package larg;
import java.util.*;
public class leap {
	private static Scanner sc;

	public static void main( String arg[])
	{
		sc = new Scanner(System.in);
		System.out.println("enter the year :");
		 int l=sc.nextInt();
		 int a;
		 a=l%4;
		 if(a==0)
		 {
			 System.out.println(l+" is leap year");
		 }
		 
		 else
		 {
			 System.out.println(l+" is non leap year"); 
		 }
	}
	
}
