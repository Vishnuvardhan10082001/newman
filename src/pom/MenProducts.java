package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenProducts {
    @FindBy(xpath="//a[text()='T-shirts']")
    private WebElement tshirt;
    @FindBy(xpath="(//div[@class='featuredProducts_cardBody__gWfky']/img)[1]")
    private WebElement levisBlack;
    @FindBy(id="Add To Cart")
    private WebElement addToCart;
    public MenProducts(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void setTshirt() {
		tshirt.click();;
	}
	public void setLevisBlack() {
		levisBlack.click();;
	}
	public void setAddToCart() {
		addToCart.click();
	}
    
}
