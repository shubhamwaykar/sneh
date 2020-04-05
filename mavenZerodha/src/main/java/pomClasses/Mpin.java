package pomClasses;

    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Mpin {
		
		@FindBy(xpath= "//input[@type='password']") private WebElement pin;
		@FindBy(xpath= "//button[@type= 'submit']") private WebElement cont;
		
		public Mpin(WebDriver driver2) {
			PageFactory.initElements(driver2, this);
		}
		
		public void Enterpin(WebDriver driver3) {
			Actions a= new Actions(driver3);
			a.moveToElement(pin).click().build().perform();
			pin.sendKeys("038631");
		}
	   public void Continue(WebDriver driver4) {
		   Actions b= new Actions(driver4);
	       b.moveToElement(cont).click().build().perform();
		   }
	}	