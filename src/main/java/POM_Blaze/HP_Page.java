package POM_Blaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HP_Page {
	@FindBy(xpath = "//h1[text()='Welcome to the Simple Travel Agency!']")private WebElement hp;
	public HP_Page(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	public String title() {
		String title1 = hp.getText();
		return title1;
		
	}

}
