package testpackmavenZerodha;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.configuration.Pojo;
import pomClasses.Mpin;
import pomClasses.ZerodhaHomePage;
import pomClasses.loginpom;
import utility.Screenshot;
public class Testclass extends Pojo {
	WebDriver driver8;
	loginpom loginpom;
	Mpin pin;
	ZerodhaHomePage homepage;
	
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
//		driver8= openOperaBrowser();
		driver8= openChromeBrowser();
//		driver8= openMozillaFirefox();
//		driver8= openEdgeBrowser();
//		driver8= openInternetExplorer();
	}
	
	@BeforeMethod
	public void screenshot() throws IOException
	{
		Screenshot ss= new Screenshot();
		ss.ScreenShot("ZerodhaLoginPageOpen", driver8);
		System.out.println("login page screenshot taken");
	}
		
	
	@Test
	public void property() throws InterruptedException
	{
		    loginpom= new loginpom(driver8);
			loginpom.user();
			loginpom.pass();
		    loginpom.signin();
		    System.out.println("login done sucessfully");
			
			Thread.sleep(2000);
			
			pin= new Mpin(driver8);
			pin.Enterpin(driver8);
			pin.Continue(driver8);
			System.out.println("Mpin accepted");
	        
	       Thread.sleep(2000);
	       
	       homepage= new ZerodhaHomePage(driver8);
	       
	       homepage.searchTataMotors();
	       Thread.sleep(2000);
	       homepage.tataMotorsList(driver8);
	       Thread.sleep(2000);
	       homepage.addTataMotorToWatchlist();
	       System.out.println("TATA MOTORS added to watchlist successfully");
	       
	       Thread.sleep(3000);
	       
	       homepage.searchEscorts();
	       Thread.sleep(2000);
	       homepage.escortsList(driver8);
	       Thread.sleep(2000);
	       homepage.addEscortsToWatchlist();
	       System.out.println("ESCORTS added to watchlist successfully");
	       
	       Thread.sleep(3000);
	       
	       homepage.searchBharatForg();
	       System.out.println("stock search successfully");
	       
	       Thread.sleep(2000);
	       
	       homepage.bharatforgList(driver8);
	       System.out.println("stocks listed");
	       
	       Thread.sleep(2000);
	       
	       homepage.openBuyWindow(driver8);
	       System.out.println("clicked on B button successfully");
	       
	       Thread.sleep(2000);
	       
	       homepage.enterQuantity();
	       
	       Thread.sleep(2000);
	       
	       homepage.buyStock();
	       System.out.println("stock bought successfully");
	       Thread.sleep(2000);
	       
	       homepage.openOrdersTab();
	       Thread.sleep(3000);
	       
	       homepage.openHoldingsTab();
	       Thread.sleep(3000);
	       
	       homepage.openPositionsTab();
	       Thread.sleep(3000);
	       
	       homepage.openFundsTab();
	       Thread.sleep(3000);
	       
	       homepage.openAppsTab();
	       Thread.sleep(3000);
	       
	       homepage.openDashboardTab();
	       Thread.sleep(3000);
	       
//	       homepage.openStartInvestingTab();
//	       Thread.sleep(2000);
//	       
//	       homepage.searchBFINVEST();
//	       Thread.sleep(2000);
//	       
//	       homepage.selectBFINVEST();
//	       Thread.sleep(2000);
//	       
//	       homepage.closeStartInvestTab();
	       
	       homepage.searchBFINVEST();
	       Thread.sleep(3000);
	       
	       homepage.openSellWindow(driver8);
	       Thread.sleep(3000);
	       
	       homepage.limitPrice();
	       Thread.sleep(3000);
	       
	       homepage.slMorder();
	       Thread.sleep(3000);
	       
	       homepage.slorder();
	       Thread.sleep(3000);
	       
	       homepage.cancel();
	       Thread.sleep(3000);
	       
	       homepage.dv1510();
	       Thread.sleep(3000);
	       
	       homepage.logout();
	       
	        }
			
	
	@AfterMethod
	public void afterMethod() throws IOException, InterruptedException
	{
		Screenshot s= new Screenshot();
		s.ScreenShot("ZerodhaHomePageOpen", driver8);
		System.out.println("home page screenshot taken");	
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void afterClass()
	{
//		driver1.close();
	}
}