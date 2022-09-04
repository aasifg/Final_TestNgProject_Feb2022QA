package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.Page1;
import initBrowser.browserPage;

public class Test2 {

	WebDriver driver;

	@Test
	public void userWillBeAbleToBrowse() {

		driver = browserPage.init();
		Page1 page1 = PageFactory.initElements(driver, Page1.class);
		page1.addData();

		String bodytext = driver.findElement(By.tagName("body")).getText();
		String[] arr = bodytext.split(":");
		String expected = arr[0].trim();
		Assert.assertEquals(expected, "The category you want to add already exists", "not found");

	}

}
