package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attachfile extends BasePage {
	public Attachfile(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="attachFile")
	private WebElement Attachfilebutton;
	@FindBy(id="file")
	private WebElement choosefilebutton;
	
	
	public void clickAttachfilebutton() {
		Attachfilebutton.click();
}
	
	public void clickchoosefilebutton(String s) {
		Attachfilebutton.sendKeys("s");
}
}