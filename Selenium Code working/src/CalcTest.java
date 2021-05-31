import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalcTest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\chnew\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.navigate().to("http://localhost:8181/DemoProject/calc.html");
		  driver.findElement(By.name("fno")).sendKeys("12");
		  driver.findElement(By.name("sno")).sendKeys("14");
		  driver.findElement(By.name("sno")).sendKeys(Keys.ENTER);
		  Thread.sleep(10000);
		  driver.close();
		  System.out.println("Test Case Passed Successfully...");
	}
}
