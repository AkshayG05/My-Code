
package appiumtests;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class calcum {
	
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
 
	public static void test() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "emulator-5554");
	   // cap.setCapability("udid","192.168.29.90:5037");
		//cap.setCapability("udid","192.168.29.209:4723");
		cap.setCapability("udid","emulator-5554");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","11");
		
		//cap.setCapability("appPackage","com.coloros.calculator");
		//cap.setCapability("appActivity","com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(cap);
		
		System.out.println("Application started.....");
		
		
		
		System.out.println("Completed....");
	}
}
