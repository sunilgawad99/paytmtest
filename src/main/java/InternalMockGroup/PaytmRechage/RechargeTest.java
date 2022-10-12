package InternalMockGroup.PaytmRechage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reuseCodes.WaitConditions;

public class RechargeTest extends WaitConditions {

	WebDriver driver;
	public RechargeTest(WebDriver driver2) {
		super(driver2);
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath="(//div[@class='_2EGQY cqA0P'])[1]")
	WebElement model;
	
	@FindBy(xpath=("//input[@maxlength='10']"))
	WebElement enterMobile;
	
	@FindBy(xpath="//button[@class='_11kC  LLvJ _3vjB']")
	List<WebElement> plans;
	
	@FindBy(xpath="//button[text()='Proceed to Recharge']")
	WebElement processRechage;
	By g = By.xpath("//button[text()='Proceed to Recharge']");
	
	@FindBy(xpath="//p[@class='heading']")
	WebElement finl;
	
	public void rechargePrepaidMobile()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		model.click();
		enterMobile.sendKeys("8999195235");
	}
	public void rechagePlans() throws InterruptedException
	{
		
		Thread.sleep(3000);
		for(WebElement ele : plans)
		{
		 String pln=ele.getText().split(" ")[1].trim();
		 
		 if(pln.equals("666"))
		 {
			 ele.click();
		 }
		
		}
		fluentWait(g);
		 processRechage.click();
		
	
		
	}

	
}
