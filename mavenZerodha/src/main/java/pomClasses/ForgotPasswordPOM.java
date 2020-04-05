package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPOM {
	
  @FindBy(xpath= "(//input[@type='text'])[1]") private WebElement user;
  @FindBy(xpath= "(//input[@type='text'])[2]") private WebElement pan;
  @FindBy(xpath="(//input[@type='radio'])[2]") private WebElement sms;
  @FindBy(xpath= "(//input[@type='text'])[3]") private WebElement email;
  @FindBy (xpath="(//input[@type='text'])[4]") private WebElement captha;
  @FindBy(xpath="//button[@type='submit']") private WebElement reset;
  
  
  
  public ForgotPasswordPOM(WebDriver driver) {
  PageFactory.initElements(driver, this);
  }
  
  public void userid()
  {
	  user.click();
	  user.sendKeys("DV1510");
  }
  
  public void panNO()
  {
	  pan.click();
	  pan.sendKeys("qwertyui");
  }
  
  public void smsbutton()
  {
	  sms.click();
  }
  
  public void capthaImage()
  {
	  captha.click();
  }
  
  public void resetButton()
  {
	  reset.click();
  }
}
