package progressivePagesCollection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfoPage extends BasePage {
	@FindBy(xpath="//input[@analytics-id='NameAndAddressEdit_FirstName']")
	WebElement enter_firstName;
	@FindBy(xpath="//input[@id='NameAndAddressEdit_embedded_questions_list_MiddleInitial']")
	WebElement enter_middleName;
	@FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_LastName']")
	WebElement enter_lastName;
	@FindBy(xpath = "//input[@id='NameAndAddressEdit_embedded_questions_list_DateOfBirth']")
	WebElement enter_dateOfBirth;
	@FindBy(xpath = "//select[@id='NameAndAddressEdit_embedded_questions_list_Suffix']")
	WebElement click_choose;
	@FindBy(xpath = "//input[@name='NameAndAddressEdit_embedded_questions_list_MailingAddress']")
	WebElement enter_streetName;
	@FindBy(xpath = "//loading-button[@class='blue']//button")
	WebElement click_okay;
	
	
	
	
	public CustomerInfoPage() {
		PageFactory.initElements(driver, this);
	}
	public void customerInfo() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		enter_firstName.sendKeys("David");
		Thread.sleep(2000);
		enter_middleName.sendKeys("George");
		Thread.sleep(2000);
		enter_lastName.sendKeys("Stock");
		Thread.sleep(2000);
		enter_dateOfBirth.sendKeys("12/14/1960");
		//click_choose.click();
		Thread.sleep(2000);
		enter_streetName.sendKeys(Keys.CLEAR);
		Thread.sleep(2000);
		enter_streetName.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		enter_streetName.sendKeys("163 lake Shore dr");
		Thread.sleep(3000);
		click_okay.click();
		
		
		
		
	}
	
	

}
