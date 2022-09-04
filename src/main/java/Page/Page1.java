package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page1 {

	@FindBy(how = How.XPATH, using = "//input[@name='categorydata']")
	WebElement ADD_CATEGORY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add category']")
	WebElement CATEGORY_BUTTON_ELEMENT;

	public void addData() {

		ADD_CATEGORY_ELEMENT.sendKeys("Aasif's_BahuBali_Project0077");
		CATEGORY_BUTTON_ELEMENT.click();

	}

}
