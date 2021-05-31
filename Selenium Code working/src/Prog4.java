import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chnew\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://www.gmail.com");
		  driver.findElement(By.name("identifier")).sendKeys("puiangtraining@gmail.com");
		  driver.findElement(By.name("identifier")).sendKeys(Keys.ENTER);
	}
}
