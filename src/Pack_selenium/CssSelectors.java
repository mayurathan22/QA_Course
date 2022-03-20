package Pack_selenium;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://github.com/login");
		driver.findElement(By.name("login")).sendKeys("mayurathanmahi7@gmail.com ");
		driver.findElement(By.name("password")).sendKeys("111111");
//		driver.findElement(By.className("btn btn-primary btn-block js-sign-in-button")).click();
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.cssSelector(".flash-close")));
		//input[@class='form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain error']
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.xpath("//input[@class='form-control input-block']")).sendKeys("master");
		driver.findElement(By.xpath("//input[@class='form-control input-block']")).clear();
	}

}
