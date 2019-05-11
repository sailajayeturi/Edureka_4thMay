package module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaClassFile {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
driver.get("https://facebook.com");
	}

}
