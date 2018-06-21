package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class SigninPage extends PageBase{

	@FindBy(name="Email")
	public WebElement emailBox;
	
	@FindBy(name="Password")
	public WebElement passwordBox;
	
	@FindBy(id="error")
	public List<WebElement> errorList;
	
	@FindBy(name="submit")
	public WebElement submitLink;
	
	
	public void signin(String email, String password){
		
		emailBox.clear();
		emailBox.sendKeys(email);
		passwordBox.clear();
		passwordBox.sendKeys(password);
		
		submitLink.click();
	}
}
