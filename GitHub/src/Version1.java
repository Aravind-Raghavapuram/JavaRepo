package Rathan;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Class1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int n1;
		        int n2;
		        String operation;


		        Scanner input = new Scanner(System.in);

		        System.out.println(" enter n2");
		        n1 = input.nextInt();

		        System.out.println(" enter n2");
		        n2 = input.nextInt();

		        
				Scanner op = new Scanner(System.in);

		        System.out.println("Please enter operation");
		        operation = op.next();

		        if (operation.equals("+") )
		        {
		            System.out.println("your answer is " + (n1 + n2));
		        }
		        if  (operation.equals("-"))
		        {
		            System.out.println("your answer is " + (n1 - n2));
		        }

		        if (operation.contentEquals("/"))
		        {
		            System.out.println("your answer is " + (n1 / n2));
		        }
		        if (operation.equals ("*"))
		        {
		            System.out.println("your answer is " + (n1 * n2));
		        }


		    }
		
}
