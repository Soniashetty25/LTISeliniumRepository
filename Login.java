package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByID {

	public static void main(String[] args) {
		   WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				  "D:\\Selenium files\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://opensource-demo.orangehrmlive.com");
		    driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.name("Submit")).click();
		    
		    
	}

}
