import java.util.Scanner;

public class AreaTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entere the height");
		
		int height = scan.nextInt();
		
		System.out.println("Enter the Width");
		
		int Width = scan.nextInt();
		
		int area = (Width*height)/2;
		
		System.out.println(area);

	}

}
