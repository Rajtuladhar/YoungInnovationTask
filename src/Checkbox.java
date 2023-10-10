package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws Throwable{
		System.setProperty("Chorme","C:\\selenium webdriver\\chorme driver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox'][2]")).click();

		
		

	}

}