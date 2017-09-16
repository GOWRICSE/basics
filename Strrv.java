import java.util.Scanner; 
public class Strrv {
    private static Scanner sc;

	public static void main(String arg[])
    {
		 System.out.println("Enter the string: ");
    	 sc = new Scanner(System.in);  
        StringBuilder SS= new StringBuilder();
        String str=sc.next();
        SS.append(str);
        SS=SS.reverse();
        System.out.println("Reversed string ");
        for (int i=0; i<SS.length(); i++)
            System.out.print(SS.charAt(i));
    }
}