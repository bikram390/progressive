package progressivePagesCollection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZipCodePage extends BasePage {
	@FindBy(xpath="//input[@id='zipCode_overlay']")
	WebElement enter_zipCode;
	@FindBy(xpath = "//input[@id='qsButton_overlay']")
	WebElement click_quote;

	public ZipCodePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void zipCodeEnter() {
		enter_zipCode.sendKeys("40509");
		click_quote.click();
		
		
	}
	

}
