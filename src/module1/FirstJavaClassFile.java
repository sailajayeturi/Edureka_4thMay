package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJavaClassFile {

	public static void main(String[] args) {
		//open chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\megha\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//open AUT(under test application)
		driver.get("https://www.facebook.com");
		
		//ID
		driver.findElement(By.id("u_0_c")).sendKeys("sailaja");
		//Name
		driver.findElement(By.name("lastname")).sendKeys("yeturi");
		//ClassName
		driver.findElement(By.className("inputtext")).sendKeys("yeturi");
		//initializing the browser
		

	}

}
