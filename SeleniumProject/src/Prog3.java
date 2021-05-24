import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chnew\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.gmail.com");
		  String actualTitle="Gmail";
		  String expectedTitle = driver.getTitle();
		  //System.out.println(driver.getTitle());
		  if (actualTitle.equals(expectedTitle)) {
			  System.out.println("Test Case Passed Successfully...");
		  } else {
			  System.out.println("Test Case Failed...");
		  }
		//  driver.close();
	}
}
