package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fillingdetails {
WebDriver driver;
@FindBy(xpath="//*[@id=\"first-name\"]")
WebElement name;
@FindBy(xpath="//*[@id=\"last-name\"]")
WebElement lastname;
@FindBy(xpath="//*[@id=\"postal-code\"]")
WebElement postlcode;
@FindBy(xpath="//*[@id=\"continue\"]")
WebElement continues;
@FindBy(xpath="//*[@id=\"finish\"]")
WebElement finshed;
public Fillingdetails(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


public void setdetails(String fname,String lsname,String code) {
	name.sendKeys(fname);
	lastname.sendKeys(lsname);
	postlcode.sendKeys(code);
	
}

public void continueclick() {
	continues.click();
}

public void finishclick() {
	finshed.click();
}




}
