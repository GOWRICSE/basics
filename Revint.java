import java.util.Scanner;
public class Revint {
	private static Scanner sc;

	public static void main( String arg[])
	{
		sc = new Scanner(System.in);
		int a=sc.nextInt();
		int revint=0;
		while(a>0)
		{
			revint=revint*10 + a%10;
			a=a/10;
		}
		System.out.println("The reversed number is"+revint);
	}
	
}
