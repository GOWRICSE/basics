package larg;
import java.util.Scanner;
public class Ndigit {
	private static Scanner scanner;

	public static void main(String[] args) 
{
	 int no,a=0;
	 System.out.println("Enter any number : ");
	 scanner = new Scanner(System.in);
	no = scanner.nextInt();

	if(no<0)
	{
	   no=no * -1;
	}
	else if(no==0)
	{
	  no=1;
	}
	while(no>0)
	{
		no=no/10;
		a++;
	}
	System.out.println("Number of Digits is: "+a);
}
}
