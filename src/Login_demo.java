package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_demo {

	public static void main(String[] args) throws Throwable{
		System.setProperty("Chorme","C:\\selenium webdriver\\chorme driver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#content > ul > li:nth-child(3) > a")).click();
		Thread.sleep(2000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		
		

	}

}
