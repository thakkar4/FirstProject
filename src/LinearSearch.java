import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int counter, num, item, array[];
	      //To capture user input
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	      num = input.nextInt(); 
	      //Creating array to store the all the numbers
	      array = new int[num]; 
	      System.out.println("Enter " + num + " integers");
	      //Loop to store each numbers in array
	      for (counter = 0; counter < num; counter++)
	        array[counter] = input.nextInt();
*/
		
		
		      Scanner scan = new Scanner(System.in);
		      int[]  array = new int[10];
		      System.out.println("Enter 10 elements:");
		      for (int i=0; i<10; i++)
		      {
		    	  array[i] = scan.nextInt();
		      }
				
		      System.out.println("Enter the search value");
				int search = scan.nextInt();
				for (int j=0; j<10; j++)
					
				{
					if (array[j]==search) {
						
						System.out.println(search+" is present at location "+(j));
						
						break;
					}
					
					if(j == 10) 
						
						System.out.println(search+" does not exist in array");
					
				}
				
				
	}
	

}
