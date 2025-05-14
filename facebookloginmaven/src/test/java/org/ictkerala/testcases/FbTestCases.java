package org.ictkerala.testcases;

import org.ictkerala.base.PreSettings;
import org.ictkerala.pages.FbLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FbTestCases extends PreSettings {
	
	FbLoginPage lobj;
	
	@BeforeClass
	public void objinit() 
	{
		lobj=new FbLoginPage(driver);
	}

	@Test
	public void TC_001() {
		lobj.verifyPage();
	}
	@Test
	public void TC_002() {
		lobj.createAccount();
	}
	@Test
	public void TC_003() {
		lobj.buttonclk();
		lobj.firstname("Adarsh");
		lobj.surname("Joseph");
		lobj.emailmobile("josephihan112@gmail.com");
		lobj.newpassword("Jesusmary@1234");
		lobj.dateofbirth();
	}
	@Test
	public void TC_004() {
		lobj.genderlocate();
	}
	@Test
	public void TC_005() {
		lobj.signUp();
	}
}
