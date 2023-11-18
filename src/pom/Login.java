package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	@FindBy(id="Email")
	private WebElement emailTbx;
	@FindBy(id="Password")
	private WebElement pwdTbx;
	@FindBy(xpath ="//span[text()='Login']")
	private WebElement LoginTbx;
	@FindBy(xpath ="//button[@type='button']/span/span")
	private WebElement setting;
	@FindBy(xpath="//li[@role='menuitem'][7]")
	private WebElement lgot;
	public Login( WebDriver driver) {
    PageFactory.initElements(driver, this);
    this.driver=driver;
    }
    public void setLogInToAppil(String email,String pwd)throws InterruptedException {
    	emailTbx.sendKeys(email);
    	pwdTbx.sendKeys(pwd);
    	LoginTbx.click();
    	System.out.println("login successfully");
    }
    public void setLogout() {
    	setting.click();
    	lgot.click();
    }
	

}
