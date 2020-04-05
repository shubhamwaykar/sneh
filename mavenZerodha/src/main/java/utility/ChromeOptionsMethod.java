package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsMethod {
	
	public WebDriver chrome()
	{
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		return driver;
	}
}
