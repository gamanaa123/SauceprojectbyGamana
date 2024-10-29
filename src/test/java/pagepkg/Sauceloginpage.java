package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Sauceloginpage {
WebDriver driver;
@FindBy(id="user-name")
WebElement username;
@FindBy(id="password")
WebElement pwsd;
@FindBy(xpath="//*[@id=\"login-button\"]")
WebElement login;

public Sauceloginpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void enterdetails(String usname,String password) {
	username.sendKeys(usname);
	pwsd.sendKeys(password);
}




public void loginbutton() {
	login.click();
}

public void titleverification() {
	String exptitle="Swag Labs";
	String actualtitle=driver.getTitle();
	Assert.assertEquals(exptitle, actualtitle,"title verified");
		}






}
