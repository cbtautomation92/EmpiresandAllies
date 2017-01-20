/***********************************************************************
 * @author 			:		Raghu Kiran MR
 * @description		: 		Generic library with reusable methods that can be used across porjects.
 * @method			:		getCongigValue()
 * @method			:		setCongigValue()
 * @method			:		toReadExcelData()
 */

package com.empiresAndAllies.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class GenericLib {
	public static String sFile;
	public static int iPassCount = 0;
	public static int iFailCount = 0;
	public static int iSkippedCount = 0;
	static public String sDirPath = System.getProperty("user.dir");
	public static String sTestDataFile = sDirPath+"\\TestData.xlsx";
	public static String sConfigFile = sDirPath+"\\Config.properties";
	public static String path=System.getProperty("user.dir")+"\\Project Images\\";
	public static Pattern imagePath=null;
	public static Screen screen = null;
	public static FileInputStream fis = null;
	public static int sStatusCnt=0;
	public static Pattern srcImage=null;
	public static Pattern TragetImage=null;
	public static String [] sImageName=null;
	
	   
	/*
	 * @author: LAKSHMI BS Description: To read the basic environment settings
	 * data from config file
	 */
	
	public static String getCongigValue(String sFile, String sKey) {
		Properties prop = new Properties();
		String sValue = null;
		try {
			InputStream input = new FileInputStream(sFile);
			prop.load(input);
			sValue = prop.getProperty(sKey);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sValue;
	}


	/*
	 * @author: LAKSHMI BS Description: To read the basic environment settings
	 * data from config file
	 */
	public static void setCongigValue(String sFile, String sKey, String sValue) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File(sFile));
			prop.load(fis);
			fis.close();

			FileOutputStream fos = new FileOutputStream(new File(sFile));
			prop.setProperty(sKey, sValue);
			prop.store(fos, "Updating folder path");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String[] toReadData(String sTestCaseID) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String [] sImageName=null;	
		try{
			fis= new FileInputStream(sTestDataFile);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh= wb.getSheet("TestData");
			int lastRow= sh.getLastRowNum();
			System.out.println("-------"+lastRow);
			for(int i=1;i<=lastRow;i++)
			{
				if(sh.getRow(i).getCell(0).toString().equals(sTestCaseID))
				{
					int iCellNum=sh.getRow(i).getLastCellNum();
					sImageName= new String[iCellNum];
					//sImageName = new String[sh.getRow(i).getLastCellNum()];
					 System.out.println(sh.getRow(i).getLastCellNum());
					 for(int j=0;j<iCellNum;j++)		
						{
						 sImageName[j]=sh.getRow(i).getCell(j).getStringCellValue();
						}
					 break;
				}
			}
			}catch(Exception e){
				e.printStackTrace();
			}
			return sImageName;
			
		}
	
	public static void isVisible(String image)
	{
		imagePath = new Pattern(path+image);
		screen=new Screen();
		try 
		{
			if(screen.exists(imagePath) != null)
			{
				NXGReports.addStep(image.replaceAll(".png", "").replaceAll("ele", "") + " is successfully displayed", LogAs.PASSED, null);
			}
		}catch(Exception e)
		{
			sStatusCnt++;
			NXGReports.addStep(image+" Not Found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
	
	public static void clickImg(String image) throws FindFailed
	{
		try{
		imagePath = new Pattern(path+image);
		screen=new Screen();
		screen.wait(imagePath,60);
		screen.click(imagePath);
		}catch(Exception e){
			sStatusCnt++;
			NXGReports.addStep(image+" Not Found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		}
		
	public static void dragDrop(String srcImageName,String TragetImageName) throws Exception
	{
		try{
			srcImage = new Pattern(path+srcImageName);
			TragetImage=new Pattern(path+TragetImageName);
		screen=new Screen();
		screen.dragDrop(srcImage,TragetImage);
		Thread.sleep(4000);
		}catch(Exception e){
			sStatusCnt++;
			NXGReports.addStep(srcImage+" Not Found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
		}
	public static void notVisible(String image)
	{
		imagePath = new Pattern(path+image);
		screen=new Screen();
		try 
		{
			if(screen.exists(imagePath) == null)
			{
				NXGReports.addStep(image.replaceAll(".png", "").replaceAll("ele", "") + " is successfully displayed", LogAs.PASSED, null);
			}
		}catch(Exception e)
		{
			sStatusCnt++;
			NXGReports.addStep(image+" Not Found", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			throw e;
		}
	}
}