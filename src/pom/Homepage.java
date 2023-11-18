package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	@FindBy(id="men")
	private WebElement men;
	@FindBy(id="women")
	private WebElement women;
	@FindBy(id="kids")
	private WebElement kids;
	@FindBy(id="electronics")
	private WebElement electronics;
	@FindBy(id="beautyProducts")
	private WebElement beauty;
	public Homepage (WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void setMen() {
//		men.click();;
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		System.out.println(" set men is executed");
	}
	public void setWomen() {
		women.click();;
	}
	public void setKids() {
		kids.click();;
	}
	public void setElectronics() {
		electronics.click();;
	}
	public void setBeauty() {
		beauty.click();;
	}

}
