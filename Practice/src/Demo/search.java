package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;

		System.setProperty("webdriver,chrome.driver", "C:\\chromedriver.exe");

		driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
		driver.get("https://www.wikipedia.org/");

		driver.findElement(By.id("searchInput")).sendKeys("ankur");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		driver.quit();

	}

}
