import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is my first project");
		
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		

	}

}
