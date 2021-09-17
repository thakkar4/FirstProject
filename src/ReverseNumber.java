import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int num =0;
		int revnum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = scan.nextInt();
		
	/*	while (num != 0) {
			
			
			revnum = revnum * 10;
			revnum = revnum + num%10;
			num = num/10;
			
					
		}
			System.out.println(revnum);
	}*/
		for (; num != 0;) {
			
			
			revnum = revnum * 10;
			revnum = revnum + num%10;
			num = num/10;
			
			
			
		}
 System.out.println(revnum);
}
}
