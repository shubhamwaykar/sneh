package browser.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Pojo {

	public static WebDriver openChromeBrowser() {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		return driver;
	}
	
	public static WebDriver openMozillaFirefox() {
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		return driver;		
	}
	
	public static WebDriver openInternetExplorer() {
		System.setProperty("webdriver.ie.driver", "F:\\Selenium\\Drivers\\IEDriverServer.exe");       // make sure your display setting is zoom on 100%
		WebDriver driver= new InternetExplorerDriver();																// to run IE on selenium
		driver.get("https://kite.zerodha.com/");
		return driver;
	}
	
	public static WebDriver openOperaBrowser() {
		System.setProperty("webdriver.opera.driver", "F:\\Selenium\\Drivers\\operadriver_win64\\operadriver.exe");
		WebDriver driver= new OperaDriver();
		driver.get("https://kite.zerodha.com/");
		return driver;
	}
	
	public static WebDriver openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver", "F:\\Selenium\\Drivers\\MicrosoftWebDriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://kite.zerodha.com/");
		return driver;		
	}
}
