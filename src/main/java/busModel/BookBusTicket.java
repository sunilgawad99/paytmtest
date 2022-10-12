package busModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reuseCodes.WaitConditions;

public class BookBusTicket extends WaitConditions {

	WebDriver driver;
	public BookBusTicket(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Bus']")
	WebElement busModel;
	
	@FindBy(xpath="//label[text()='From']")
	WebElement from;
	
	@FindBy(xpath="//label[text()='To']")
	WebElement to;
	By by=By.xpath("//div[text()='Bus']");
	public void busBooking()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,850)");
		fluentWait(by);
		//explicitWait(busModel);
		busModel.click();
		explicitWait(from);
		from.sendKeys("pune");
		explicitWait(to);
		to.sendKeys("osamanabad");
	}
	
	
	
	
	
	
	
}
