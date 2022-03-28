package appiumtests.appiumtests;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class pdf {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriverManager.chromedriver().setup();
	      WebDriver driver = new ChromeDriver();
		
		   driver.get("https://www.ilovepdf.com/pdf_to_jpg"); //URL
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click(); //file to open and browse
		   Thread.sleep(3000);
		   Runtime.getRuntime().exec("C:\\Users\\USer\\Downloads\\aks\\upload.exe"); // location of auto it compile file
		   Thread.sleep(5000);
		   driver.findElement(By.id("processTaskTextBtn")).click(); //download file button
		   //Thread.sleep(3000);
}
}