import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		
		//second testor
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		//first tester
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		//developer
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		//second developer
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		
		//tester1
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		//tester2
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		//developerr
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		//developerr2
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		driver.findElement(By.xpath("//a[@value='KQH']")).click();
		
		
		
  
		
	}
	

}