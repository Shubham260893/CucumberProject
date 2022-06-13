package PageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonSeleniumMethods.SeleniumActions;
import TestBase.TestBase;


public class CarGuideHomepage extends SeleniumActions {
	
	
	@FindBy(xpath="//a[contains(text(),'buy + sell')]")
	public  WebElement clickBuyAndSell;
	
	@FindBy(xpath="//a[contains(text(),'Search Cars')]")
	public  WebElement clickSearchCar;
	
	public CarGuideHomepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void hoverElement()
	{

		moveToElement(clickBuyAndSell);
	
	}
	
	public SearchCarLocator clickonSearchCar()
	{
		clickSearchCar.click();
		return new SearchCarLocator();
	}

}
