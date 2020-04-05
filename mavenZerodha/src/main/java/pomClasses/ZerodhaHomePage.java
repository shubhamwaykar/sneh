package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {
	
	@FindBy(xpath="//input[@id='search-input']") private WebElement searchField;
	@FindBy(xpath="(//span[text()= 'TATAMOTORS'])[1]") private WebElement selectTMotors;
	@FindBy(xpath="//button[@class='button-green']") private WebElement addTataMotor;	
	@FindBy(xpath="(//span[text()= 'ESCORTS'])[1]") private WebElement selectEscorts;
	@FindBy(xpath="//button[@class='button-green']") private WebElement addEscorts;
	@FindBy(xpath="(//span[text()= 'BHARATFORG'])[2]") private WebElement selectBharatForg;
	@FindBy(xpath="//button[@data-balloon= 'Buy']") private WebElement bButton;
	@FindBy(xpath="//button[@type='submit']") private WebElement buy;
	@FindBy(xpath="//button[@data-balloon= 'Sell']") private WebElement sButton;
	@FindBy(xpath="//button[@type='submit']") private WebElement sell;
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement quantity;
	@FindBy(xpath="(//label[@class='su-radio-label'])[1]") private WebElement mis;
	@FindBy(xpath="(//label[@class='su-radio-label'])[2]") private WebElement cnc;
	@FindBy(xpath="(//label[@class='su-radio-label'])[3]") private WebElement market;
	@FindBy(xpath="(//label[@class='su-radio-label'])[4]") private WebElement limit;
	@FindBy(xpath="(//label[@class='su-radio-label'])[5]") private WebElement sl;
	@FindBy(xpath="(//label[@class='su-radio-label'])[6]") private WebElement slM;
	@FindBy(xpath="//label[@class='su-switch-control']") private WebElement switchcontrol;
	@FindBy(xpath="//button[@data-balloon= 'Chart']") private WebElement graph;
	@FindBy(xpath="(//button[@class='button-blue'])[1]") private WebElement startinvesting;
	@FindBy(xpath="//input[@id='search-input']") private WebElement searchinstartinvesting;
	@FindBy(xpath="//li[@class='search-result-item selected']") private WebElement selectbfinvest;
	@FindBy(xpath="(//button[@type='button'])[10]") private WebElement closestartinvest;
	@FindBy(xpath="//span[text()= 'Orders']") private WebElement orders;
	@FindBy(xpath="//span[text()= 'Dashboard']") private WebElement dashboard;
	@FindBy(xpath="//span[text()='Holdings']") private WebElement holdings;
	@FindBy(xpath="//span[text()='Positions']") private WebElement positions;
	@FindBy(xpath="//span[text()='Funds']") private WebElement funds;
	@FindBy(xpath="//span[text()='Apps']") private WebElement apps;
	@FindBy(xpath="//button[@class='button-outline cancel']") private WebElement cancel;
	@FindBy(xpath="//span[text()='DV1510']") private WebElement DV1510;
	@FindBy(xpath="//a[@target='_self']") private WebElement logout;
	
	
	public ZerodhaHomePage(WebDriver driver5) {
		PageFactory.initElements(driver5, this);
	}
	
	public void searchBharatForg() {
		searchField.click();
		searchField.sendKeys("BharatForg");
	}
	
	public void bharatforgList(WebDriver driver6) {
		Actions a= new Actions (driver6);
		a.moveToElement(selectBharatForg).build().perform();
	}
	
	public void openBuyWindow(WebDriver driver7) {
		Actions b= new Actions(driver7);
		b.moveToElement(bButton).click().build().perform();
	}
	public void openSellWindow(WebDriver driver14) {
		Actions s= new Actions(driver14);
		s.moveToElement(sButton).click().build().perform();
	}
	public void enterQuantity() {
		quantity.click();
		quantity.sendKeys("1000");
	}
	
	public void buyStock() {
		buy.click();
	}
	
	public void sellStock() {
		sell.click();
	}
	
	public void limitPrice() {
		limit.click();
	}
	
	public void openMIS() {
		mis.click();
	}
	
	public void openGraph() {
		graph.click();
	}
	
	public void searchTataMotors() {
		searchField.click();
		searchField.sendKeys("TataMotors");
	}
		
	public void tataMotorsList(WebDriver driver9) {
			Actions t= new Actions(driver9);
			t.moveToElement(selectTMotors).build().perform();
	}
		
	public void addTataMotorToWatchlist() {
		addTataMotor.click();
	}
	
	public void searchEscorts() {
		searchField.click();
		searchField.sendKeys("Escorts");
	}
	
	public void escortsList(WebDriver driver10) {
		Actions e= new Actions(driver10);
		e.moveToElement(selectEscorts).build().perform();
	}
	
	public void addEscortsToWatchlist() {
		addEscorts.click();
	}
	
	public void openOrdersTab() {
		orders.click();
	}
	
	public void openHoldingsTab() {
		holdings.click();
	}
	
	public void openPositionsTab() {
		positions.click();
	}
	
	public void openFundsTab() {
		funds.click();
	}
	
	public void openAppsTab() {
		apps.click();
	}
	
	public void openDashboardTab() {
		dashboard.click();
	}
	public void openStartInvestingTab() {
		startinvesting.click();	
	}
	public void searchBFINVEST() {
		searchinstartinvesting.click();
		searchinstartinvesting.sendKeys("BFINVEST");
	}
	public void selectBFINVEST() {
		selectbfinvest.click();
	}
	public void closeStartInvestTab() {
		closestartinvest.click();
	}
	public void limitorder() 
	{
		if(limit.isSelected())
		{
			System.out.println("limit order opened");
		}
		else
		{
		limit.click(); 
		}
	}
	public void slorder() {
		sl.click();
	}
	public void slMorder() {
		slM.click();
	}
	public void switchcontrol() {
		switchcontrol.click();
	}
	public void cancel() {
		cancel.click();
	}
	public void dv1510() {
		DV1510.click();
	}
	public void logout() {
		logout.click();
	}
	
}
