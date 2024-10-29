package pagepkg;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Productsadd {
WebDriver driver;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
WebElement item1;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
WebElement item2;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
WebElement item3;
@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
WebElement item4;

@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
WebElement item5;

@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
WebElement item6;

@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
WebElement cartclick;
@FindBy(id="checkout")
WebElement checkoutclick;
public Productsadd(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void additem1() {
	
	item1.click();
}

public void additem2() {
	item2.click();
}
public void additem3() {
	item3.click();
}
public void additem4() {
	item4.click();
}
public void additem5() {
	item5.click();
}
public void additem6() {
	item6.click();
}

public void cartclick() {
	cartclick.click();
	
}
public void checkoutclick() {
	checkoutclick.click();
}
public void textverification()  {
	String expectedtext="Products";
	String actualtext=driver.getPageSource();
	if(actualtext.contains(expectedtext)) {
	System.out.println("text verified as same");	
	}
	else {
		System.out.println("text verified as different");
	}
	
}
public void screenshot() throws IOException {
	//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	FileHandler.copy(src, new File("‪C:\\Users\\devina aju\\Desktop\\New folder\\screenshot.png"));
	File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1, new File("C:\\\\Users\\\\devina aju\\\\Desktop\\\\New folder\\\\screenshot.png"));
}

}