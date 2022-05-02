package serviceToolsStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RequestAppraisal_Test {
	
	private WebDriver driver;
	RequestAppraisalPage recuestAppraisalPage;

	@Before
	public void setUp() throws Exception {
		recuestAppraisalPage = new RequestAppraisalPage(driver);
		driver = recuestAppraisalPage.chromeDriverConnection();
		recuestAppraisalPage.visit("https://qa.ciencuadras.com/"); 
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		recuestAppraisalPage.appraise();
		recuestAppraisalPage.requestForm();
		recuestAppraisalPage.billingForm();
		recuestAppraisalPage.payFinish();
		recuestAppraisalPage.purchaseDetail();
	}

}
