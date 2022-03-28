package Alure_reports;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllureRports {
	
public static WebDriver driver; 
	
	@Test
	public void validatelogin() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        driver.get("https://sspnsamiti.com/ssi_prp_20/outer.php"); 
		driver.findElement(By.xpath("//*[@id=\"navlist\"]/li[5]/a")).click();
        driver.findElement(By.id("username")).sendKeys("RANM0162");
        driver.findElement(By.id("password")).sendKeys("vtpl009!@#$");
        Thread.sleep(8000);
        String no1,no2;
       no1= driver.findElement(By.id("num1")).getAttribute("value");
       int n1 = Integer.parseInt(no1);
        no2=driver.findElement(By.id("num2")).getAttribute("value");
        int n2 = Integer.parseInt(no2);
        int n=n1+n2;
        driver.findElement(By.id("captcha")).sendKeys(""+n);
        driver.findElement(By.xpath("//*[@id=\"main1\"]/center/table/tbody/tr/td[1]/div/form/input[6]")).click();
        driver.close();
        driver.quit();
    }
	
	
}


