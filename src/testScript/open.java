package testScript;

import java.io.IOException;
import java.sql.Driver;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import pom.Homepage;
import pom.Login;

public class open extends BaseClass {
    @Test
	public static void test() {
     
		Homepage hm=new Homepage(driver);
		hm.setMen();

	}

}
