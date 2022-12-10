package com.Baselayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	protected static WebDriver driver;
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
//		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		// driver.get("https://praf002.github.io/");
		// driver.get("https://www.redbus.in/");
		driver.get("https://www.facebook.com/reg");

	}

}
