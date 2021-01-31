package progressiveTestRunner;

import org.testng.annotations.Test;

import progressivePagesCollection.BasePage;

public class AutomationTest extends BasePage {

	@Test
	public void progressiveAutomationTesting() throws Exception {
		hp.clickAuto();
		zp.zipCodeEnter();
		Thread.sleep(2000);
		cp.customerInfo();
		Thread.sleep(3000);
		vp.VachalChoose();
		Thread.sleep(3000);
		dp.driverInfoPage();
		Thread.sleep(3000);
		dpp.detailPage();
		
		
	}
}
