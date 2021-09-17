import java.util.Scanner;

// Verify Input number is positive or negative

public class PosNag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		if (number < 0) {
			System.out.println("Number is negative");
		}
		else if(number > 0) {
			
			System.out.println("Number is Positive");
		}
			
			else {
				
				System.out.println("Number is neither negative or positive");
			}
			
		}

	}


