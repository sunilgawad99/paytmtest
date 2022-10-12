package Paytm.rechage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import busModel.BookBusTicket;

public class BusTicketModel {
	
	WebDriver driver;
	
	
	BaseClass base;
	@BeforeMethod
	
	public void preRequisites()
	{
	 base = new BaseClass();
	 driver=BaseClass.initilationBrowser();
		base.url();
		
	}
	
	
	@Test
	public void busTicket()
	{
		BookBusTicket bbt = new BookBusTicket(driver);
		
		bbt.busBooking();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
