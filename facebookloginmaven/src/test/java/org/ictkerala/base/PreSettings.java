package org.ictkerala.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PreSettings {
	
	public WebDriver driver;
	Properties prop;
	
	public void propload() throws IOException {
		
		FileInputStream propobj=new FileInputStream("D:\\ICTAK_SW_TESTING_COURSE\\EXIT_TEST\\Mock_test\\facebookloginmaven\\src\\test\\resources\\config.properties");
		prop=new Properties();
		prop.load(propobj);
	}
	@BeforeTest
	public void configurations() throws Exception {
		propload();
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

}
