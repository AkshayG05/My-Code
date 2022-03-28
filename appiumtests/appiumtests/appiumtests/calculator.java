package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class calculator {
	
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
		
		cap.setCapability("deviceName", "Samsung Galaxy M31");
		cap.setCapability("udid","192.168.29.163:5555");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","11");
		
		cap.setCapability("deviceName", "Samsung Galaxy M31");
		cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		
		URL url = new URL("http://127.0.0.1:4724/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(cap);
		
		System.out.println("Application started.....");
		
		WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
		WebElement plus = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Plus\"]"));
		WebElement Three = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03"));
		WebElement equals = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		WebElement result = driver.findElement(By.className("android.widget.Button"));
		
		
		
		two.click();
		plus.click();
		Three.click();
		equals.click(); 
		
		
		
		System.out.println("Completed....");
	}
}
