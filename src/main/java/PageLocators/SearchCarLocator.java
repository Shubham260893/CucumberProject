package PageLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonSeleniumMethods.SeleniumActions;

public class SearchCarLocator extends SeleniumActions {
	
	@FindBy(xpath="//select[@id='makes']")
	public WebElement selectmaker;
	
	@FindBy(xpath="//select[@id='models']")
	public WebElement selectmodel;
	
	@FindBy(xpath="	//select[@id='locations']")
	public WebElement selectlocation;
	
	@FindBy(xpath="//input[@id='search-submit']")
	public WebElement clickSearch;
	
	
	public SearchCarLocator()
	{
		PageFactory.initElements(driver	, this);
	}
	
	public void selectmaker(String text)
	{
		select(selectmaker, text);
	}
	
	public void selectmodel(String text)
	{
		select(selectmodel, text);
	}
	public void selectlocation(String text)
	{
		select(selectlocation, text);
	}
	
	public void clickSearch()
	{
		clickSearch.click();
	}
	

}
