package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWork1 {
	WebDriver driver;
	By selectText = By.xpath("//*[@id=\"1\"]/h3/a/em");
	By inputId = By.id("kw");
	By submitButton = By.id("su");
	public HomeWork1(WebDriver driver){
		this.driver = driver;
	}
	
	public void search(WebElement element,String keyword) {
		element = driver.findElement(this.inputId);
		element.clear();
		element.sendKeys(keyword);
		element.submit();
		element = driver.findElement(this.submitButton);
		element.click();
	}
	
	public String getText(WebDriver driver,WebElement element) {
		element = driver.findElement(this.selectText);
		String text = element.getText();
		System.out.println(text);
		return text;
	}

}
