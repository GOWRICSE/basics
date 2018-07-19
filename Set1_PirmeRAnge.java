package player;
import java.util.Scanner;
public class Set1_PirmeRAnge 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count,prime=0;
		for(int i=n1;i<=n2;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i % j == 0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			{
				prime++;
			}
		}
		System.out.println(prime);
	}
}