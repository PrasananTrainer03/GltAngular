import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chnew\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("http://localhost:4200");
		  driver.findElement(By.name("userName")).sendKeys("GreyLine");
		  driver.findElement(By.name("passWord")).sendKeys("GreyLine");
		  WebElement elem = driver.findElement(By.name("login"));
		  elem.click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[contains(.,'First')]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[contains(.,'Second')]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[contains(.,'Third')]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[contains(.,'Event')]")).click();
		  WebElement elem1 = driver.findElement(By.name("hello"));
		  elem1.click();
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();
		  WebElement elem2 = driver.findElement(By.name("company"));
		  elem2.click();
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();
		  WebElement elem3 = driver.findElement(By.name("topic"));
		  elem3.click();
		  Thread.sleep(3000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[contains(.,'Calc')]")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.name("firstNo")).sendKeys("12");
		  driver.findElement(By.name("secondNo")).sendKeys("15");
		  WebElement sum = driver.findElement(By.name("sum"));
		  sum.click();
		  Thread.sleep(3000);
		  WebElement sub = driver.findElement(By.name("sub"));
		  sub.click();
		  Thread.sleep(3000);
		  WebElement mult = driver.findElement(By.name("mult"));
		  mult.click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[contains(.,'Fourth')]")).click();
		  driver.close();
	}
}
