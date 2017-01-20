package com.empiresAndAllies.library;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.empiresAndAllies.library.GenericLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import io.appium.java_client.android.AndroidDriver;

public class BaseLib 
{
	public AndroidDriver driver;
	static public String sDirPath=System.getProperty("user.dir");
	static public String sConfigFile=sDirPath+"\\EmpiresAndAllies.Properties";
	static public String sAPKPath = sDirPath+"\\EmpireAndAlliesAPKFile\\Empires&Allies.apk";
	public DesiredCapabilities capabilities=null;
	public static int sStatusCnt=0;
	WebDriverWait wait=null;
	public Screen screen =new Screen();
	
	@BeforeTest
	public void setUp()
	{
		try
		{
			File app = new File(sAPKPath);
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("automationName",GenericLib.getCongigValue(sConfigFile, "AUTOMATIONNAME") );
			capabilities.setCapability("platformName",GenericLib.getCongigValue(sConfigFile, "PLATFORMNAME") );
			capabilities.setCapability("platformVersion",GenericLib.getCongigValue(sConfigFile, "PLATFORMVERSION"));
			capabilities.setCapability("deviceName",GenericLib.getCongigValue(sConfigFile, "DEVICENAME") );
			capabilities.setCapability("app",app.getAbsolutePath());
			capabilities.setCapability("apppackage", GenericLib.getCongigValue(sConfigFile, "APPPACKAGE") );
			capabilities.setCapability("appactivity", GenericLib.getCongigValue(sConfigFile, "APPACTIVITY") );
			capabilities.setCapability("noReset",true);
			capabilities.setCapability("launchTimeout",700000);
			driver=new AndroidDriver(new URL(GenericLib.getCongigValue(sConfigFile, "URL")), capabilities);
			driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
			NXGReports.setWebDriver(driver);
		}
		catch(Exception e)
		{
			System.out.println("Problem in launching the App");
			e.printStackTrace();
		}
	}
	
	public void launchapp(){
		try{
		Thread.sleep(5000);
		driver.closeApp();
		Thread.sleep(5000);
		driver.launchApp();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
