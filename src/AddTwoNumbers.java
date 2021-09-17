import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a = 10;
		int b = 15;
		
		int sum = a+b;
		
		System.out.println("Total of two number is "+sum); */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number");
		int number1 = scan.nextInt();
		
		System.out.println("Enter you second number");
		int number2 = scan.nextInt();
		
	     System.out.println("Enter your name");
	     
	     String name = scan.next();
		
		scan.close();
		
		int sum = number1+number2;
	    System.out.println("total number is "+sum);
	    System.out.println("My name is " +name);
		
		
	}

}
