import java.util.Scanner;

public class AAAA {

/*	public static void main(String[] args) {
		 
		 String i="Hitesh";
	      switch(i)
	      {
		 case "Kanu":
		   System.out.println("Case1 ");
		   break;
		 case "Hitesh":
		   System.out.println("Case2 ");
		   break;
		 case "Manu":
		   System.out.println("Case3 ");
		   break;
		 case "Bhanu":
	           System.out.println("Case4 ");
		default:
		 System.out.println("Default ");
	      }

	} */
	
	public static void main(String[] args) {

    	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
    }

}
