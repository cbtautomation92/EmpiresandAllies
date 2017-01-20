/***********************************************************************
 * @author 			:		LAKSHMI BS
 * @description		: 		Implemented ITestListener interface and overrided methods as per requirement. It listenes to all the events performed by Testng and keep track of it.
 * @method			:		onTestStart()
 * @method			:		onTestSuccess()
 * @method			:		onTestFailure()
 * @method 			:		onTestSkipped()
 * @method			:		onTestFailedButWithinSuccessPercentage()		
 * @method 			:		onStart()
 * @method 			:		onFinish()
 * @method 
 */
package com.empiresAndAllies.library;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {
	public static File sHtmlReports;
	public static File sTestngReports;
	public static String sdate;
	public static String STestCaseID=null;
	
	
	public TestngListener() throws IOException 
	{
		Date date = new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss");
        sdate = sdf.format(date);
		
        sHtmlReports=new File(GenericLib.sDirPath+"//..//Reports//HTMLReports");
		sTestngReports= new File(GenericLib.sDirPath+"//..//Reports//TestNGReports");
		

	
		if(!sHtmlReports.exists())
		{
			FileUtils.forceMkdir(sHtmlReports);
		}
		if(!sTestngReports.exists())
		{
			FileUtils.forceMkdir(sTestngReports);
		}
			System.setProperty("KIRWA.reporter.config", "KIRWA.properties");
	}

	public void onTestStart(ITestResult result) 
	{
		STestCaseID = result.getName();
	}

	public void onTestSuccess(ITestResult result) 
	{
	}

	public void onTestFailure(ITestResult result) 
	{
	
	}

	public void onTestSkipped(ITestResult result) 
	{
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
	}

	public void onStart(ITestContext context) 
	{
	}

	public void onFinish(ITestContext context) 
	{
		File testOuput = new File(GenericLib.sDirPath+"\\test-output");    
		String sTestngReports= GenericLib.sDirPath+"\\..\\Reports\\TestNGReports\\TestNG_"+sdate;	   
	    if(testOuput.renameTo(new File(sTestngReports)))
         {
        
         }else
         {
           System.out.println("testoutput is not moved");
         }
	}

}
