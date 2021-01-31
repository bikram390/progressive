package progressivePagesCollection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VachalInfoPage extends BasePage {
	@FindBy(xpath="//ul[@role='listbox']//li[contains(text(),'2012')]")
	WebElement click_year;
	@FindBy(xpath = "//ul[@role='listbox']//li[contains(text(),'BMW')]")
	WebElement click_make;
	@FindBy(xpath = "//ul[@role='listbox']//li[contains(text(),'328')]")
	WebElement click_model;
	@FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_BodyStyle']")
	WebElement click_engine;
	@FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_VehicleUse']")
	WebElement click_personal;
	@FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_OwnOrLease']")
	WebElement click_ownerShip;
	@FindBy(xpath = "//select[@id='VehiclesNew_embedded_questions_list_LengthOfOwnership']")
	WebElement click_ownerShipTime;
	@FindBy(xpath = "//input[@id='VehiclesNew_embedded_questions_list_GaragingSameAsMailingAddress_Y']")
	WebElement click_radioBtn;
	@FindBy(xpath = "//forward-navigation//loading-button[@class='blue']//button")
	WebElement click_done;
	@FindBy(xpath = "//loading-button[@class='blue']//button")
	WebElement click_continous;
	



	public VachalInfoPage() {
		PageFactory.initElements(driver, this);
		
	}
	public void VachalChoose() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(2000);
	
		click_year.click();
		Thread.sleep(3000);
		click_make.click();
		Thread.sleep(3000);
		click_model.click();
		Thread.sleep(3000);
		click_engine.sendKeys("2DR 6CYL");
		Thread.sleep(3000);
		click_ownerShipTime.sendKeys("5 year or more");
		Thread.sleep(3000);
		click_personal.sendKeys("Personal");
		Thread.sleep(3000);
		click_ownerShip.sendKeys("Own");
		Thread.sleep(4000);
		click_radioBtn.click();
		Thread.sleep(4000);
		click_done.click();
		Thread.sleep(4000);
		click_continous.click();
		
		
	}

}
