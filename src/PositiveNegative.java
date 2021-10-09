import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        
        // Displaying the number 
        if (num>=0) {
        System.out.println(num+ " The number is positive ");
        }
        else {
        	
        	System.out.println(num+ " The number is Negative ");
        }
        
    

	}

}
