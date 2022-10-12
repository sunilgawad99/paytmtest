package reuseCodes;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConditions {
	WebDriver driver;
	
	public WaitConditions(WebDriver driver2) {
		this.driver=driver2;
	}

	public void fluentWait(final By by)
	{
		Wait<WebDriver> wait= new FluentWait<>(driver).withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofMillis(200)).ignoring(Exception.class);
		
		wait.until(new Function<WebDriver,WebElement>(){
			
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(by);
			}
		});
	}
	public void explicitWait(WebElement ele)
	{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	
	
	
	
	
	
	
}
