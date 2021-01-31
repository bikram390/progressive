package progressivePagesCollection;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DriverInfoPage extends BasePage{
	@FindBy (xpath="//input[@id='DriversAddPniDetails_embedded_questions_list_Gender_M']")
	WebElement click_radioBtn;
	@FindBy (xpath="//select[@id='DriversAddPniDetails_embedded_questions_list_MaritalStatus']")
	WebElement choose_marrietalstatus;
	@FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_HighestLevelOfEducation']")
	WebElement choose_education;
	@FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_EmploymentStatus']")
	WebElement choose_employStatus;
	@FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_Occupation']")
	WebElement type_work;
	@FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_PrimaryResidence']")
	WebElement choose_residence;
	@FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_HasPriorAddress']")
	WebElement click_move;
	@FindBy(xpath = "//select[@id='DriversAddPniDetails_embedded_questions_list_LicenseStatus']")
	WebElement choose_licence;
	@FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_HasAccidentsOrClaims_N']")
	WebElement click_report;
	@FindBy(xpath = "//input[@id='DriversAddPniDetails_embedded_questions_list_HasTicketsOrViolations_N']")
	WebElement click_ticket;
	@FindBy(xpath = "//loading-button[@class='blue']//button")
	WebElement click_continous;
	@FindBy (xpath="//loading-button[@class='blue']//button")
	WebElement click_continou;
	@FindBy(xpath = "//loading-button[@class='blue']")
	WebElement click_continoue;
	@FindBy(xpath = "//loading-button[@class='blue']")
	WebElement click_contino;

	
	
	
	
	
	public DriverInfoPage() {
		PageFactory.initElements(driver, this);
	}
	public void driverInfoPage() throws Exception {
		Thread.sleep(4000);
		click_radioBtn.click();
		Thread.sleep(3000);
		choose_marrietalstatus.sendKeys("Single");
		Thread.sleep(3000);
		choose_education.sendKeys("Collage degree");
		Thread.sleep(5000);
		choose_employStatus.sendKeys("Employed");
		Thread.sleep(3000);
		type_work.sendKeys("Warehouse Worker");
		Thread.sleep(3000);
		choose_residence.sendKeys("Own home");
		Thread.sleep(3000);
		click_move.sendKeys("No");
		Thread.sleep(3000);
		click_report.click();
		Thread.sleep(3000);
		choose_licence.sendKeys("Permit");
		Thread.sleep(3000);
		click_report.click();
		Thread.sleep(3000);
		click_ticket.click();
		Thread.sleep(3000);
		click_continous.click();
		Thread.sleep(3000);
		click_continou.click();
		Thread.sleep(3000);
		click_continoue.click();
		Thread.sleep(3000);
		click_contino.click();
		
		
	}
	

}
