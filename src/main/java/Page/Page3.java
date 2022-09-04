package Page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Page3 {

	@FindBy(how = How.XPATH, using = "//select[@name='due_month']")
	WebElement MONTH_DROPDOWNBUTTON_ELEMENT;

	public void selectDropDown() {

		Select sel = new Select(MONTH_DROPDOWNBUTTON_ELEMENT);
		List<WebElement> fullList = sel.getOptions();
		{
			for (WebElement i : fullList) {
			}

			MONTH_DROPDOWNBUTTON_ELEMENT.click();

		}

	}

}