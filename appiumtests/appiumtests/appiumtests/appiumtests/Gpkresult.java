package appiumtests.appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class Gpkresult {
	
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
		
		cap.setCapability("deviceName", "android");
		cap.setCapability("udid","IV4L89C66L4TQOPV");
		cap.setCapability("udid","192.168.29.90:5555");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","9");
		//cap.setCapability("app","C:\\Users\\USer\\Documents\\app\\GudExams-app.apk");
		
		cap.setCapability("appPackage","com.vtpl.schoolapplication");
		cap.setCapability("appActivity","com.vtpl.schoolapplication.Activity.SplashActivity");
		
		//cap.setCapability("appPackage","in.redbus.android");
		//cap.setCapability("appActivity","in.redbus.android.payment.bus.buspaymentfailuregft.BusPaymentfailureGFTActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(cap);
		
		System.out.println("Application started.....");
	}	
		
}
