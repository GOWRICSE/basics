package larg;
import java.util.Scanner;
public class Sumnloop {
	private static Scanner scanner;

	public static void main( String arg[])
	{
		
		int  i,add=0;
		System.out.println("Enter value of n ");
		scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int a[]=new int[n];
		System.out.println("The values are  ");
		for(i=0;i<n;i++)
		{
		a[i]=scanner.nextInt();
		}
		for(i=0;i<n;i++)
		{
		 add+=a[i];
		}
		System.out.println("Sum : "+add);
	}
}
