import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isVowel = false;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		char ch = scan.next().charAt(0);
		
		scan.close();
		
		switch(ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':	isVowel = true;
		
		}
		
		if(isVowel == true) {
			
			System.out.println(ch+ " is a Vowel");
			
		}
			
			else if(isVowel==false){
				
				System.out.println(ch+ " is a Constonant");
				
			}
				else {
					
					System.out.println(ch+ " is not Vowel or Constonant");
				}
			

	}
}
