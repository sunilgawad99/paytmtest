package Paytm.rechage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import InternalMockGroup.PaytmRechage.RechargeTest;
import InternalMockGroup.PaytmRent.RentPaymentTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	static WebDriver driver;
	
	public static WebDriver initilationBrowser()
	
	{
		
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public RechargeTest landingPage()
	{
		return new RechargeTest(driver);
	}
	public void url()
	{
		driver.get("https://paytm.com/");
	}
	public RentPaymentTest rentpage()
	{
		return new  RentPaymentTest(driver);
	}
	public static void driverClose()
	{
		driver.close();
		driver=null;
	}
}
