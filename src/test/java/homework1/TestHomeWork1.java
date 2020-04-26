package homework1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomeWork1 {
	WebDriver driver;
	WebElement element;
	HomeWork1 hw1;
	
	By selectText;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.baidu.com");
		System.out.println("Home page title: "+driver.getTitle());
	}
	
	@Test
	public void test_HomeWork_One() throws InterruptedException {
		hw1 = new HomeWork1(driver);
		hw1.search(element, "learn English");
		Thread.sleep(5000);
		hw1.search(element, "learn Chinese");
		
		Thread.sleep(5000);

		String text = hw1.getText(driver, element);
		
		Assert.assertEquals(text, "Learn Chinese");
		
		Thread.sleep(5000);
		driver.quit();
	}
	
}
