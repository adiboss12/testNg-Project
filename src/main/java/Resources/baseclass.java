package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseclass {
	
	public WebDriver driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException {
		
		//to read the data
		FileInputStream fs = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\MavenProject17Nov\\src\\main\\java\\Resources\\data.properties");
		
		//access data.properties file-
		 prop = new Properties();
		
		//loading the readed file
		prop.load(fs);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
		//	WebDriverManager.chromedriver().browserVersion("79.0.9").setup();
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			
		}
		else {
			System.out.println("please enter proper browser value");
		}
				
		
	}
	@BeforeMethod
	public void launchURL() throws IOException {
		initializeDriver();
		//this driver has scope
		String url = prop.getProperty("url");
		driver.get(url);
		
	}

}
