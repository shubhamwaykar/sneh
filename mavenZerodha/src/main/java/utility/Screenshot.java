package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public void ScreenShot (String s, WebDriver driver) throws IOException
	{
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("G:/BOOKS\\s.jpg");
		FileUtils.copyFile(source, dest);
	}
}
