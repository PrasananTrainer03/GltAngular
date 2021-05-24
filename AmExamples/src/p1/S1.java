package p1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class S1 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "D:\\chnew\\chromedriver.exe");  
		    WebDriver driver=new ChromeDriver();  
		      
		// Launch website  
		    driver.navigate().to("http://www.google.com/");  
		   // driver.close();
		    driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
		  //  driver.findElement(By.id("btnK")).click();  
		//  driver.findElement(By.name("btnK")).click();  
		//  driver.close();
	}
}
