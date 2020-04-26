package homework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeWork2 {
	WebDriver driver;
	
	@FindBy(id="uid")
	WebElement testFireUsername;
//	driver.findElement(By.className("uid")).sendKeys("strUserName);
//	FindBy(name="uid")=driver.findElement(By.className("uid"));
	
	@FindBy(id="passw")
	WebElement testFirePassword;
	
	@FindBy(name="btnSubmit")
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td[2]/div/h1")
	WebElement loginTitleTest;
	
	public HomeWork2(WebDriver driver) {
		this.driver = driver;
//		这个方法将创建所有的WebElements
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String username) {
		this.testFireUsername.sendKeys(username);
	}
	
	public void setPassword(String password) {
		this.testFirePassword.sendKeys(password);
	}
	
	public void clickLogin() {
		this.btnLogin.click();
	}
	
	public String getLoginTitle() {
		return this.loginTitleTest.getText();
	}
	
	public void loginToTestFire(String username,String password) {
		this.setUserName(username);
		this.setPassword(password);
		this.clickLogin();
	}
}
