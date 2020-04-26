package homework1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TestHomeWork2 {
	WebDriver driver;
	HomeWork2 hw2;
	HomeWork2_SuccessLoginPage hw2_slp;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.testfire.net/login.jsp");
	}
	
	@Test
	public void Home_Test() throws InterruptedException {
		hw2 = new HomeWork2(driver);
		
		String loginTitleTest = hw2.getLoginTitle();
		System.out.println("loginTitleTest");
		Assert.assertEquals(loginTitleTest, "Online Banking Login");
		
		hw2.loginToTestFire("admin", "admin");
		
		hw2_slp = new HomeWork2_SuccessLoginPage(driver);
		String successInfo = hw2_slp.getSuccessInfo();
		System.out.println(successInfo);
		Assert.assertEquals(successInfo, "Congratulations!");
		
		Thread.sleep(10000);
		
		driver.quit();
	}
}
