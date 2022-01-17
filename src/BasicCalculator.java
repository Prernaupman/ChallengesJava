import java.util.Scanner;
public class BasicCalculator {
	public static void main(String[] args) {
		int n1;
		int n2;
		String operation;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number");
		n1=input.nextInt();
		System.out.println("Enter the second number");
		n2=input.nextInt();
		Scanner op=new Scanner(System.in);
		System.out.println("Enter the operation");
		operation=op.next();
		if(operation.equals("+"))
		{
			System.out.println("your answer is" +(n1+n2));
		}
		if(operation.equals("-"))
		{
			System.out.println("your answer is" + (n1-n2));
		}
		if(operation.equals("/"))
		{
			System.out.println("your answer is" + (n1/n2));
		}
		if(operation.equals("*"))
		{
			System.out.println("your answer is" + (n1*n2));
		}
	}
}
