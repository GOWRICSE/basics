package larg;
import java.util.*; 
public class Large 
{
	private static Scanner sc;

	public static void main( String arg[])
	{
		sc = new Scanner(System.in);
		System.out.println("enter the values :");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		 int c=sc.nextInt();
		if(a>b)
		{
		    if(a>c)
		    {
		    	System.out.println(" a is large");
		    }
		    else{
		    	System.out.println(" c is large");
		    }
		}
		else
		if(b>c)
		{
			System.out.println(" b is large");
		}
		else
		{
			System.out.println(" c is large");
	}

}
}
