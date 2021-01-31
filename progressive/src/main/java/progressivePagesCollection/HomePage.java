package progressivePagesCollection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


	//driver.findElement(By.xpath("//a[@data-qs-product='AU']")).click();

	@FindBy(xpath="//a[@data-qs-product='AU']")
	WebElement click_auto;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickAuto() {
		click_auto.click();
	}
}
