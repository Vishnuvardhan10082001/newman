package testScript;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.Homepage;
import pom.MenProducts;

public class BokkProduct extends BaseClass {
   @Test
   public void add() throws InterruptedException {
	  Homepage hm=new Homepage(driver);
	  hm.setMen();
	  System.out.println(" set men");
	  MenProducts mp=new MenProducts(driver);
	  Thread.sleep(2000);
	  mp.setTshirt();
	  System.out.println("set t-shirt");
	  mp.setLevisBlack();
	  Thread.sleep(2000);
	  mp.setAddToCart();
	   
   }
}
