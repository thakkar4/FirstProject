
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 55; int num2 = 107; int num3 = 85;
		
		int temp = (num1 >= num2) ? num1 : num2;
		
		int largest = (num3 >= temp) ? num3 : temp;
		
		System.out.println(" The largest number is: "+largest);
		

	}

}
