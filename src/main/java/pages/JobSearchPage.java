package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class JobSearchPage extends PageBase {

	@FindBy(name = "JobCategory")
	public WebElement jobcatagoryLink;

	@FindBy(name = "submit")
	public WebElement submitButton;

}
