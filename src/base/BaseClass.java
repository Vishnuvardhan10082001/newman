package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import GenericPackage.Common;
import pom.Login;

public class BaseClass {
	public static  WebDriver driver;
	public static String url;
	public static String email;
	public static String psw;
	static Login lg;
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@BeforeClass
	public static void OpenBrower() throws IOException {
		driver=new ChromeDriver();
		lg=new Login(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@BeforeMethod
	public static void log() throws IOException, InterruptedException {

		Common co=new Common();
		url=co.user("url");
		email=co.user("email");
		psw=co.user("psw");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.id("loginBtn")).click();
		lg.setLogInToAppil(email, psw);
	}
	@AfterMethod
	public static void lgout() {
		//lg.setLogout();
	}
	@AfterClass
	public static void afterCls() {
		//driver.close();
	}

}
