package Pack_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/");
//		driver.findElement(By.id("user_email")).sendKeys("mayu ");
		driver.findElement(By.className("position-relative mr-3 mb-4 mb-lg-0 d-inline-block")).click();
	}

}
