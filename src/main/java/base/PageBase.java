package base;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageBase extends Driver {

	public String getRandomlySelectedOption(WebElement element) {
		String option = null;

		Select select = new Select(element);
		int optionCount = select.getOptions().size();
		int randomIndex = getRandomNumber(1, optionCount - 1);
		select.selectByIndex(randomIndex);

		option = select.getFirstSelectedOption().getText();

		return option;
	}

	public int getRandomNumber(int min, int max) {
		int randomNumber = 0;
		Random random = new Random();
		randomNumber = random.nextInt(max + 1 - min) + min;
		return randomNumber;
	}

	public void getHoverOver(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);

		action.moveToElement(element).perform();

	}
}