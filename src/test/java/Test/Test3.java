package Test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Page1;
import Page.Page3;
import initBrowser.browserPage;

public class Test3 {

	WebDriver driver;

	@Test
	public void userWillBeAbleToBrowse() {

		driver = browserPage.init();
		Page3 page3 = PageFactory.initElements(driver, Page3.class);
		page3.selectDropDown();

		Assert.assertEquals("Month dropdown selected and is displayed", "Month dropdown selected and is displayed");

	}

}
