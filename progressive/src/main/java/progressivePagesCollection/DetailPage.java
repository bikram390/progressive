package progressivePagesCollection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailPage extends BasePage {
	// @FindBy(xpath="//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_Y']")
	// WebElement click_radioBtn;
	@FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_RecentAutoInsuranceCompanyPeriod']")
	WebElement choose_currentCompany;
	@FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_BodilyInjuryLimits']")
	WebElement choose_injuryLimits;
	@FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_BodilyInjuryLimits']//option[contains(text(),'$25,000/$50,000 or $60K CSL or less')]")
	WebElement select_injuryLimits;
	@FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']")
	WebElement click_policies;
	@FindBy(xpath = "//input[@analytics-id='FinalDetailsEdit_PriorProgressive_N']")
	WebElement click_progressiveprior;
	@FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_AdvancedShopperPolicyEffectiveDate']")
	WebElement type_effectivedate;
	@FindBy(xpath = "//input[@analytics-id='FinalDetailsEdit_PrimaryEmailAddress']")
	WebElement type_email;
	@FindBy(xpath = "//select[@id='FinalDetailsEdit_embedded_questions_list_TotalResidents']")
	WebElement choose_residents;
	@FindBy(xpath = "//select[@analytics-id='FinalDetailsEdit_TotalPipClaimsCount']")
	WebElement choose_claimscount;
	@FindBy(xpath = "//loading-button[@class='blue']//button")
	WebElement click_contionue;
	/*
	 * @FindBy(xpath =
	 * "//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_N']")
	 * WebElement click_enrollment;
	 */
	  @FindBy(xpath ="//input[@id='SnapshotEnrollment40Edit_embedded_questions_list_SnapshotPolicyEnrollment_N']")
	  WebElement click_enrollOption;
	  
	  @FindBy(xpath = "//loading-button[@class='blue']//button")
	  WebElement click_button;
	 
	@FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceToday_N']")
	WebElement click_insurance;
	@FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_InsuranceLastMonth_N']")
	WebElement click_lastMonth;
	@FindBy(xpath = "//input[@id='FinalDetailsEdit_embedded_questions_list_OtherPolicies_N']")
	WebElement click_policie;
	@FindBy(xpath = "//select[@analytics-id='FinalDetailsEdit_CurrentResidence']")
	WebElement dd_durationOfResidence;
	@FindBy(xpath = "//select[@analytics-id='FinalDetailsEdit_CurrentResidence']//option[contains(text(),'Less than 1 year')]")
	WebElement select_durationOfResidence;
	

	public DetailPage() {
		PageFactory.initElements(driver, this);
	}

	public void detailPage() throws Exception {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(4000);
		click_insurance.click();
		Thread.sleep(3000);
		click_lastMonth.click();
		Thread.sleep(3000);
		click_policie.click();
		Thread.sleep(3000);
		type_email.sendKeys("abcde@gmail.com");
		Thread.sleep(3000);
		choose_residents.sendKeys("4");
		Thread.sleep(3000);
		dd_durationOfResidence.click();
		Thread.sleep(3000);
		select_durationOfResidence.click();
		Thread.sleep(3000);
		choose_claimscount.sendKeys("0");
		Thread.sleep(3000);
		click_contionue.click();
		Thread.sleep(3000);

		click_enrollOption.click();
		click_button.click();
		// choose_currentCompany.sendKeys("1 to 3 years");
		// Thread.sleep(4000);
		// choose_injuryLimits.click();
		// Thread.sleep(2000);
		/*
		 * select_injuryLimits.click(); Thread.sleep(3000); click_policies.click();
		 * Thread.sleep(3000); click_progressiveprior.click(); Thread.sleep(3000);
		 * type_effectivedate.sendKeys("02.02.2021"); Thread.sleep(3000);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * Thread.sleep(3000); click_insurance.click(); Thread.sleep(3000);
		 * click_lastMonth.click(); Thread.sleep(3000); click_policie.click();
		 * 
		 * click_enrollment.click(); Thread.sleep(3000); click_experience.click();
		 * Thread.sleep(3000); click_button.click();
		 * 
		 */

	}

}
