package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestdJobSearch extends TestBase{

	@BeforeClass
	public void classSetUp(){
		

		menuBar.jobsearchLink.click();

	}
	@Test
	public void testRandomselect(){
		
		jobsearchPage.getRandomlySelectedOption(jobsearchPage.jobcatagoryLink);
		
		jobsearchPage.submitButton.click();
		
		String currentUrl = driver.getCurrentUrl();
		
		Assert.assertTrue(currentUrl.contains("/jobsearch"));
		
	}
	@Test
	public void testRandomSelectOption(){
		jobsearchPage.getRandomNumber(2, 4);
		
		jobsearchPage.submitButton.click();
		
	}
}
