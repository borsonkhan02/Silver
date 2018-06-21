package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;

public class TestEmployer extends TestBase {

	@BeforeClass

	public void classSetUp() {

		menuBar.employerLink.click();
	}

	@Test

	public void testWithHoveOver() {

		employerPage.jobpostLink.click();

		String currenUrl = driver.getCurrentUrl();

		Assert.assertTrue(currenUrl.contains("/jobpost."));
		
		TimeUnit.MINUTES.toNanos(1);

	}
}
