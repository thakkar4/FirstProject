import java.util.Scanner;

public class Poduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter First number");
		
		int num1 = scan.nextInt();
		
		System.out.println(" Enter Second number ");
		
		int num2 = scan.nextInt();
		
		scan.close();
		 
		int productt = num1*num2;
		
		System.out.println(" output "+productt);
	}

}
