package CommonSeleniumMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class SeleniumActions extends TestBase {
	
	
	public static void moveToElement(WebElement element)
	{
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
	
	public static void select(WebElement element,String text)
	{
		Select s= new Select(element);
		s.selectByVisibleText(text);
		
	}

}
