package startKite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {

@Test()
public void HomePage() {

		
		//System.getProperty("webdriver.chrome.driver", "C:\\Anuj\\exeFiles\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Anuj\\exeFiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.cssSelector("input#userid")).sendKeys("ct5142");
		driver.findElement(By.cssSelector("input#password")).sendKeys("12129");
		driver.findElement(By.cssSelector("button.button-orange.wide")).click();
	}

}
