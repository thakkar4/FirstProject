
public class Website {
	
	String webName;
	   int webAge;
	   
	   // Default Constructor
	/*   Website() {
			
			this.webName="Hitesh";
			this.webAge=45;
		}*/
	   
	   // Parameterized Constructor
	   
	   Website(String name, int age) {
		   
		   this.webName = name;
		   this.webAge = age;
		   
		   
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Website obj1 = new Website("Hitesh", 45);
		System.out.println(obj1.webName);
		System.out.println(obj1.webAge);
		
	}

}
