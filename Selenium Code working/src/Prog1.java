import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "D:\\chnew\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://www.google.com");
		 // System.out.println(driver.getTitle());
		  String expectedTitle = "Google";
		  String actualTitle = driver.getTitle();
		  
		  if (expectedTitle.equals(actualTitle)) {
			  System.out.println("Test Case Passed Successfully....");
		  } else {
			  System.out.println("Test Case Failed...");
		  }
		  driver.close();
//		  driver.findElement(By.name("q")).sendKeys("What is Java");
//		  driver.close();
	}
}
