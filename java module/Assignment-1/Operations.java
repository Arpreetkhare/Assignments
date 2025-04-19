/*8. Write a program to perform addition, subtraction, multiplication, division, and 
modulus operations on two integer numbers and display the results.*/
import java.util.*;


public class Operations{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int a=sc.nextInt();
		System.out.print("Enter Second integer: ");
		int b=sc.nextInt();
		
		int sum=a+b;
		int subs=a-b;
		int product=a*b;
		int quotient=a/b;
		int remainder=a%b;
		
		System.out.println("sum: "+sum);
		System.out.println("substractions: "+subs);
		System.out.println("Multiplication: "+product);
		System.out.println("Division: "+quotient);
		System.out.println("Modulo: "+remainder);
		
	}
		
}