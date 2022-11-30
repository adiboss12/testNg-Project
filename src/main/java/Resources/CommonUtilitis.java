package Resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtilitis {
	
	public static WebDriver driver;
	
	//this method is for handling dropdown
	public static void HandleStaticDropDown(WebElement element, int index) {
		
		WebElement p = element;
		Select s = new Select(p);
		 s.selectByIndex(index);
		
	}
	
	//this method is for handling assertion
	public static void handleassertion(String expected, String actual) {
		
          SoftAssert s = new SoftAssert();
		
		String Expected = expected;
		String Actual = actual;
		s.assertEquals(Expected, Actual);
		s.assertAll();
		
	}
	
	

	public static void handleExplicitWait(int duration, WebElement element) {


		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(10));
		wb.until(ExpectedConditions.visibilityOf(element));
		
	}

}
