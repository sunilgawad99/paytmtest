package Paytm.rechage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import InternalMockGroup.PaytmRent.RentPaymentTest;

public class Rent_Payment {
	BaseClass base;
	@BeforeMethod
	
	public void preRequisites()
	{
	 base = new BaseClass();
		BaseClass.initilationBrowser();
		base.url();
		
	}
	@DataProvider
	public Object[] getCRMTestData()
	{
		Map<String,String> map = new HashMap<>();
		map.put("acno","2111236135237246");
		map.put("ifc", "AUBL0002361");
		map.put("name", "sunil mohan gawad");
		map.put("mobile", "9970998098");
		 Object[]data= {map};
		 return data;
	}

	@Test(dataProvider="getCRMTestData")
	public void rentPayment(HashMap<String,String> map)
	{
		
		
		RentPaymentTest rent=base.rentpage();
		rent.rentModel(map.get("acno"),map.get("ifc"),map.get("name"),map.get("mobile"));
	}
	//@AfterClass
	public void unload()
	{
		BaseClass.driverClose();
	}
	
}
