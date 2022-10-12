package InternalMockGroup.PaytmRent;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RentPaymentTest {
 WebDriver driver;
	public RentPaymentTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='_3vgAs'])[2]")
	WebElement rentPay;
	@FindBy(xpath="(//input[@maxlength='30'])[1]")
	WebElement ac;
	@FindBy(xpath="(//input[@maxlength='30'])[2]")
	WebElement ifc;
	@FindBy(xpath="(//input[@maxlength='30'])[3]")
	WebElement name;
	@FindBy(xpath="(//input[@maxlength='30'])[4]")
	WebElement mobile;
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement process;
	public void rentModel(String acn,String ife,String name1, String mobile1) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		rentPay.click();
		
		wait.until(ExpectedConditions.visibilityOf(ac));
		ac.sendKeys(acn);
		wait.until(ExpectedConditions.visibilityOf(ifc));
		ifc.sendKeys(ife);
		wait.until(ExpectedConditions.visibilityOf(name));
		name.sendKeys(name1);
		js.executeScript("window.scrollBy(0,350)");
		wait.until(ExpectedConditions.visibilityOf(mobile));
		mobile.sendKeys(mobile1);
		wait.until(ExpectedConditions.visibilityOf(process));
		process.click();
		
	}
	public void rentPay()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		for(int i=1; i<=4;i++)
		{
			driver.findElement(By.xpath("//input[@maxlength='30'])['"+i+"']")).sendKeys("2111236135237246");
		}
		
	}

}
