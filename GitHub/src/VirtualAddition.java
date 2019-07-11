import java.util.Scanner;
public class VirtualAddition {

		   public static void main(String args[])
		   {
		      int x, y, z;
		 
		      System.out.println("Enter two integers for arithmetic operations");
		      
		      Scanner in = new Scanner(System.in);
		     
		      x = in.nextInt();
		      y = in.nextInt();
		      
		      z = x + y;
		      System.out.println("Sum of the two integers = " + z);
		      z=x*y;
		      System.out.println("multiplication of the integers = " + z);
		      z=x/y;
		      System.out.println("divison of the integers = " + z);
		      z=x-y;
		      System.out.println("substraction of the integers = " + z);
		     
		     
		   }
	

	}

