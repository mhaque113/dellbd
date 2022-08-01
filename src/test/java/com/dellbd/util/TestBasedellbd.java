package com.dellbd.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class TestBasedellbd {
	public static Properties pro;
	public static WebDriver driver ;
	
	public TestBasedellbd() {
		
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\dellbd\\config\\configdellbd.properties");
			
 pro = new Properties();
 pro.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
					
		}
			
			
			
	public void initz() {
		
				String browsername = pro.getProperty("browser");
				if (browsername.equalsIgnoreCase(browsername)) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\dellusa\\Driver\\chromedriver.exe");
				driver.manage().timeouts().implicitlyWait(utildellbd.implicitlyWait_ab, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(utildellbd.pageLoadTimeout_bc, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				
				}
				
				else
					System.out.println("Browser Not Found");		
					
		
	}
	
	public  void launchBrowser() {
		
	
		
		driver.get(pro.getProperty("url_qa"));
		
		
	}
	
}
