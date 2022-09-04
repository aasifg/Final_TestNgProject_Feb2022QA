package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Page1;
import initBrowser.browserPage;

public class Test1 {

	WebDriver driver;

	@Test
	public void userWillBeAbleToBrowse() {

		driver = browserPage.init();
		Page1 page1 = PageFactory.initElements(driver, Page1.class);
		page1.addData();

		Assert.assertEquals("displayed", "displayed");
	}

}
