package progressivepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Progressivepage {
	public Progressivepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	//private static WebElement element = null;
	public static  WebElement auto_search (WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("a[@data-qs-product='AU']"));
		return element; 
	}
	public static WebElement button_search(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//input[@id='zipCode_overlay']"));
		return element;
		
	}
	
	
	

}