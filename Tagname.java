package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
				  "D:\\Selenium files\\chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		    driver.findElement(By.tagName("a")).click();
		    List<WebElement> links=driver.findElements(By.tagName("a"));
		    for(WebElement w:links)
		    { System.out.println(w.getText());}
		    //
	}

}
