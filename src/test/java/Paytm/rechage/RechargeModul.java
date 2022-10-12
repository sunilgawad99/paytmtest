package Paytm.rechage;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import InternalMockGroup.PaytmRechage.RechargeTest;

public class RechargeModul {

	
	
	@Test
	
	public void rechageModel() throws InterruptedException
	{
		BaseClass.initilationBrowser();
		BaseClass base = new BaseClass();
		base.url();
		RechargeTest re=base.landingPage();
		re.rechargePrepaidMobile();
		
	}
	@AfterClass
	public void unload()
	{
		BaseClass.driverClose();
	}
}
