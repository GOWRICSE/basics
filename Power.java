package larg;
import java.util.*;
public class Power {
 private static Scanner sc;

public static void main( String args[])
 {
	 sc = new Scanner(System.in);
	 System.out.println("enter Base : ");
	 int a=sc.nextInt();
	 System.out.println("enter power : ");
	 int b=sc.nextInt();
	 int c=(int) Math.pow(a, b);
	 System.out.println("Answer: "+c);
 }
}
