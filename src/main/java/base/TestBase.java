package base;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.EmployerPage;
import pages.JobSearchPage;
import pages.MenuBar;
import pages.SigninPage;

public class TestBase extends Saucelabs{
	public static MenuBar menuBar;
	public static SigninPage signinPage;
	public static EmployerPage employerPage;
	public static JobSearchPage jobsearchPage;
	
	@BeforeSuite
	public void setUp() {

		if (Boolean.valueOf(getProperty("saucelabs"))) {
			// run test in saucelabs
			setSauceLabs();

		} else {

			// run test locally
			setDriver();
		}
		
		
		menuBar = PageFactory.initElements(driver, MenuBar.class);
		signinPage = PageFactory.initElements(driver,SigninPage.class );
		employerPage = PageFactory.initElements(driver, EmployerPage.class);
		jobsearchPage = PageFactory.initElements(driver, JobSearchPage.class);

	}
	@AfterSuite
	public void tearDown() {

		driver.quit();
	}

}


