package TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	private static WebDriverWait wait;
	private static final int TIMEOUT= 30;
	private static final int PAGE_LOAD_TIMEOUT=50;
	
	
	
	
	public static void OpenURL(String url)
	{
		driver.get(url);
	}
	
	
	public static void setUpDriver()
	{
		if(driver==null)
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get("https://www.carsguide.com.au");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	}
	
	public static void tearDown()
	{
		if(driver!=null)
		{
			driver.close();
			driver.quit();
		}
		
	}
	

}
