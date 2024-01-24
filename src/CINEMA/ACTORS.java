package CINEMA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACTORS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AmarVeeravalli\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.cinejosh.com/review-list/1");
		
     
	driver.findElement(By.linkText("Home")).click();
	
	driver.findElement(By.linkText("Naa Saami Ranga Pre-Release Event")).click();
	
	 
	
	driver.findElement(By.xpath("//a[@href='/gallery-thumbs/48819/3/0/1/guntur-kaaram-stills.html']")).click();
	
driver.findElement(By.xpath("//img[@alt='Guntur Kaaram Stills - 3 of 4']")).click();

Thread.sleep(5000);

driver.findElement(By.linkText("Home")).click();

JavascriptExecutor javaScript = (JavascriptExecutor)driver;
javaScript.executeScript("window.scrollBy(0,1500)");

Thread.sleep(3000);

 driver.findElement(By.partialLinkText("/review/90s-web-series")).click();
		}

}
