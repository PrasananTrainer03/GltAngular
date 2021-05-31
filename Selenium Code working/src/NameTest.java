import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chnew\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://localhost:8181/DemoProject/Name.html");
		  driver.findElement(By.name("firstName")).sendKeys("Lalitha");
		  driver.findElement(By.name("lastName")).sendKeys("Samiraju");
		  driver.findElement(By.name("lastName")).sendKeys(Keys.ENTER);
		  Thread.sleep(10000);
		  driver.close();
		  System.out.println("Test Case Passed Successfully...");
	}
}
