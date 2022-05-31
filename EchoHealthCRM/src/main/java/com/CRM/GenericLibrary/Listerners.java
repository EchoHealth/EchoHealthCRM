package com.CRM.GenericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listerners  implements ITestListener{
	
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName() +" - Method Started" , true);	
	}

	public void onTestSuccess(ITestResult result) {
		//Reporter.log(result.getName() +"- Method Success", true);	
		
		test = extent.createTest(result.getName());
		test.pass(MarkupHelper.createLabel(result.getName() + "method passed ", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		
	
	//	Reporter.log(result.getName() +" - Method Failed", true);
		
		test = extent.createTest(result.getName());
		test.fail(MarkupHelper.createLabel(result.getName() + "method failed ", ExtentColor.RED));
	}

	public void onTestSkipped(ITestResult result) {
		//Reporter.log(result.getName() +" - Method Skipped", true);	
		
		test = extent.createTest(result.getName());
		test.fail(MarkupHelper.createLabel(result.getName() + "method skipped ", ExtentColor.ORANGE));
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log(result.getName() +" - Method Failed with Time Out", true);		
	}

	public void onStart(ITestContext context) {
	
		//Reporter.log(context.getName() +" - Started", true);
		
		spark = new ExtentSparkReporter(IAutoConstant.CUSTOM_REPORT_PATH);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Example Report");
		spark.config().setReportName("Example Report name");
		
		 extent = new ExtentReports();
		 extent.attachReporter(spark);
	}

	public void onFinish(ITestContext context) {
		
		//Reporter.log(context.getName() +"-  Finished", true);
		extent.flush();
	}
}