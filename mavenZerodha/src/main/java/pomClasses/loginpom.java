package pomClasses;

	import org.openqa.selenium.WebDriver;    
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class loginpom {

		
		@FindBy(xpath= "//input[@type='text']") private WebElement username;
		@FindBy(xpath= "//input[@type='password']") private WebElement password;
		@FindBy(xpath= "//button[@type='submit']") private WebElement login;
		@FindBy(xpath= "//a[text()='Forgot password?']") private WebElement forgotpassword;
		
		
		public loginpom (WebDriver driver1) {
			PageFactory.initElements(driver1, this);
	    	}
			
			public void user() {
				username.click();	
				username.sendKeys("DV1510");
			}
			
			public void pass() {
				password.click();
				password.sendKeys("vijay123");
			}
			
			public void signin() {
				login.click();
				
			}	
				public void forgotpass() {
					forgotpassword.click();
				}
}
	
	

