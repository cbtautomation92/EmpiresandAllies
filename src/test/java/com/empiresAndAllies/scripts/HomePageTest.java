package com.empiresAndAllies.scripts;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.empiresAndAllies.library.BaseLib;
import com.empiresAndAllies.library.GenericLib;
import com.empiresAndAllies.library.TestngListener;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

public class HomePageTest extends BaseLib 
{
	public String sData[]=null;
	public String sTestCaseID=null;
	String [] sImageName;
	/* 
	 * @Description: To Verify the display of Elements in Default Home Page.
	 * @Author: Raghu
	 */
	@Test(priority=1,enabled=true, description="To Verify the display of Elements in Default Home Page")
	public void defaultHomePage() throws Exception
	{
		sTestCaseID="defaultHomePage";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			
			Thread.sleep(30000);
			GenericLib.clickImg(sImageName[21]);
			Thread.sleep(10000);
			GenericLib.isVisible(sImageName[18]);
			GenericLib.clickImg(sImageName[17]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[1]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[1]);
			Thread.sleep(8000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[12]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[14]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[7]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[19]);
			GenericLib.clickImg(sImageName[8]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[15]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[16]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[11]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[11]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[20]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[13]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[18]);
			Thread.sleep(5000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
		}
		catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		
	}
	@Test(priority=2,enabled=true, description="Build a guard tower in Empire base  in Empire base")
	public void bulidguardtower() throws Exception{
		sTestCaseID="bulidguardtower";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			Thread.sleep(9000);
			GenericLib.clickImg(sImageName[1]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[1]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[7]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[8]);
			Thread.sleep(5000);
			GenericLib.dragDrop(sImageName[4],sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[9]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[10]);
			Thread.sleep(30000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
		}	
		catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=3,enabled=true, description="Build a Troop Tarmac in Empire base and add the Soliders in it")
	public void buildTroopTarmac() throws Exception{
		sTestCaseID="buildTroopTarmac";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			Thread.sleep(9000);
			GenericLib.clickImg(sImageName[1]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[11]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[7]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[8]);
			Thread.sleep(60000);
			GenericLib.isVisible(sImageName[9]);
			Thread.sleep(6000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
			
		}catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	
	@Test(priority=4,enabled=false, description="Collect Supplies from Supply Drop and Oil from Oil Derrick and verify the collected count is updated  ")
	public void updateSupplyOil() throws Exception{
		sTestCaseID="updateSupplyOil";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			Thread.sleep(9000);
			GenericLib.clickImg(sImageName[1]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.notVisible(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(5000);
			GenericLib.notVisible(sImageName[7]);
			Thread.sleep(5000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
			
		}catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	
	@Test(priority=6,enabled=false, description="Attack an Enemy force and Win the battle. Verify the supplies and oil counts are updated")
	public void attackEnemyBase() throws Exception{
		sTestCaseID="attackEnemyBase";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			Thread.sleep(9000);
			GenericLib.clickImg(sImageName[8]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[10]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(30000);
			GenericLib.isVisible(sImageName[7]);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
			
		}catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=7,enabled=false, description="Add the Supply Stockpile and verify the maximum supplies count in 'supply counter' is updated.")
	public void addsupplystockpile() throws Exception{
		sTestCaseID="addsupplystockpile";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			
			Thread.sleep(9000);
			GenericLib.clickImg(sImageName[4]);
			Thread.sleep(8000);
			GenericLib.clickImg(sImageName[1]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[4]);
			GenericLib.notVisible(sImageName[5]);
			Thread.sleep(8000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
			
			
		}catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=8,enabled=false, description="Add the  Fuel Stockpile and verify the maximum oil count in 'oil counter' is updated. ")
	public void addFuelStockpile() throws Exception{
		sTestCaseID="addFuelStockpile";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			launchapp();
			Thread.sleep(9000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.notVisible(sImageName[6]);
			Thread.sleep(6000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
			
			
		}catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=9,enabled=false, description="Win the second battle and verify the gold is updated")
	public void collectGold() throws Exception{
		sTestCaseID="collectGold";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			Thread.sleep(9000);
			GenericLib.isVisible(sImageName[9]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(30000);
			GenericLib.clickImg(sImageName[7]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[8]);
			GenericLib.notVisible(sImageName[9]);
			Thread.sleep(8000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
			
			
		}catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=10,enabled=false, description="Upgrade the Header Quarters and Verify the supplies count is deducted,Verify the Level is updated to Level 2")
	public void upgradeHeadQuarters() throws Exception{
		sTestCaseID="upgradeHeadQuarters";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			launchapp();
			Thread.sleep(9000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[10]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[6]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[7]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[8]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[9]);
			Thread.sleep(8000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
			
		}catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	@Test(priority=11,enabled=true, description="Connect and Disconnect to FB from the application and Verify the FB is connected and disconnected")
	public void connectfacebook() throws Exception{
		sTestCaseID="connectfacebook";
		sImageName= GenericLib.toReadData(sTestCaseID);
		try{
			launchapp();
			Thread.sleep(9000);
			GenericLib.clickImg(sImageName[1]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[3]);
			Thread.sleep(5000);

			GenericLib.clickImg(sImageName[3]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[4]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[5]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[2]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[6]);
			Thread.sleep(5000);
			GenericLib.clickImg(sImageName[7]);
			Thread.sleep(5000);
			GenericLib.isVisible(sImageName[3]);
			Thread.sleep(8000);
			Assert.assertTrue(GenericLib.sStatusCnt==0, "Script Failed");
			NXGReports.addStep("All elements are displayed", LogAs.PASSED, null);
			
		}catch (AssertionError e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		catch(Exception e)
		{
			NXGReports.addStep("Testscript Failed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
}
