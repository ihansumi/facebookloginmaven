package org.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FbLoginPage {
	
	WebDriver driver;
	
	public FbLoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void verifyPage() {		
		String expurl="https://www.facebook.com/";
		String acturl=driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl);	
	}
	public void createAccount() {
		WebElement account=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		String act_text=account.getText();
		String Exp_text="Create new account";
		Assert.assertEquals(act_text,Exp_text );		
	}
	public void buttonclk() {
		WebElement account=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		account.click();		
	}
	public void firstname(String name)
	{
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys(name);	
	}
	public void surname(String sname) {
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys(sname);
	}
	public void emailmobile(String email) {
		WebElement mailmob=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mailmob.sendKeys(email);		
	}
	public void newpassword(String npass) {
		WebElement newpasswd=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		newpasswd.sendKeys(npass);
	}
	public void dateofbirth() {
		WebElement dobirth=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		dobirth.click();
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']/option[@value='3']"));
		day.click();
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']/option[@value='5']"));
		month.click();
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']/option[@value='1988']"));
		year.click();
	}
	public void genderlocate() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement genderFemale = wait.until(ExpectedConditions.elementToBeClickable(
		    By.xpath("//input[@type='radio' and @name='gender' and @value='female']")
		));
		genderFemale.click();
	}
	public void signUp() {
		WebElement sign=driver.findElement(By.xpath("//button[@type='submit' and text()='Sign Up']"));
		sign.click();
		
	}
}
