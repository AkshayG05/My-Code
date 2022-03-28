package appiumtests.appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;



public class Apptestcase {
	
	static AppiumDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			test();
			 
		}catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
			
			
		}

	}
	
 
	public static void test() throws Exception  {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "emulator-5554");
		
		
		URL url = new URL("http://127.0.0.1:4724/wd/hub");
		cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/ApiDemos-debug.apk");
		driver = new AppiumDriver<MobileElement>(cap);
		
		System.out.println("Application started.....");
	}	
		
}
