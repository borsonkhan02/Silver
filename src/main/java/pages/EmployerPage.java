package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class EmployerPage extends PageBase{

	@FindBy(linkText="Employer")
	public WebElement employerLink;
	

	@FindBy(linkText="Job Post")
	public WebElement jobpostLink;
	
	public void getHoverOver(WebDriver driver, WebElement element){
		
		Actions action = new Actions(driver);
		
		action.moveToElement(employerLink).perform();
		
		driver.findElement(By.linkText("Job Post")).click();
}}
