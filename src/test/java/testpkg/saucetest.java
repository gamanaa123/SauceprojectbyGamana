package testpkg;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pagepkg.Fillingdetails;
import pagepkg.Productsadd;
import pagepkg.Sauceloginpage;
import utilpkg.Excelutils;
public 
class saucetest {
WebDriver driver;
@BeforeTest
public void setUp() {
	driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");	
	}
@Test
public void testdetails() throws InterruptedException, IOException {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Sauceloginpage so=new Sauceloginpage(driver);
	so.titleverification();
	String xl="C:\\Users\\devina aju\\Desktop\\Untitled spreadsheet.xlsx";
	String sheet="Sheet1";
	int rowCount=Excelutils.getRowCount(xl, sheet);
	for(int i=1;i<=rowCount;i++) {
		String usernme=Excelutils.getCellValue(xl, sheet, i, 0);
		System.out.println("username......."+usernme);
		String passwrd=Excelutils.getCellValue(xl, sheet, i, 1);
		System.out.println("password..........."+passwrd);
		so.enterdetails(usernme, passwrd);
		so.loginbutton();
		Thread.sleep(40);
		driver.navigate().refresh();
	}
		Productsadd ad=new Productsadd(driver);
		ad.textverification();
		ad.screenshot();
		ad.additem1();
		ad.additem2();
		js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		ad.additem3();
		ad.additem4();
		ad.additem5();
		ad.additem6();
		js.executeScript("window.scrollBy(0,-1000)");
		ad.cartclick();
		js.executeScript("window.scrollBy(0,1000)");
		ad.checkoutclick();
		Thread.sleep(1000);
		Fillingdetails de=new Fillingdetails(driver);
		
		de.setdetails("Gamana", "Haridas", "686673");
		de.continueclick();
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,1000)");
		de.finishclick();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.navigate().back();
	}



}














































