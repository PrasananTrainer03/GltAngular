import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chnew\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.google.com");
		  driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  driver.close();
	}
}
