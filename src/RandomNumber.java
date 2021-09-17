
//In the below program, we are using the nextInt() method of Random class to serve our purpose.


import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   System.out.println("Generate random numbers");
	   
	   Random rnum = new Random();
	   
	   for(int i = 0; i<3; i++) {
		   
		   System.out.println(rnum.nextInt(500));
	   }

	}

}
