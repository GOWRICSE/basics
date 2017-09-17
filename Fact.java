import java.util.Scanner; 
public class Fact{
	 private static Scanner aa;

		public static void main(String arg[])
		{
			
			 aa= new Scanner(System.in);
			 int f,i;
			System.out.println("enter the number ");
			int n=aa.nextInt();
			f=1;
			for(i=1;i<=n;i++)
			{
				f=f*i;
			}
			System.out.println("the factorial of "+n+" is " +f);
		}
}
