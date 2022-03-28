package appiumtests.appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class App  {
	
	@Test
	
	public void myfirstprog() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "emulator-5554");
		
		cap.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"/ApiDemos-debug.apk");
	
         AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);	

				
		
	}
	
	
}