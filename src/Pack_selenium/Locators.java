package Pack_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		driver.findElement(By.name("email")).sendKeys("mayurathanmahi7@gmail.com ");
		driver.findElement(By.name("password")).sendKeys("111111");
		driver.findElement(By.className("p-v-2-xs")).click();
	}

}
