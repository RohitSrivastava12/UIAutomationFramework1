package com.inetBanking.utilities;



import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class inetBankingExtentManager {
	public static ExtentSparkReporter sparkreport;
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static void setExtent() {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-Report-"+timestamp+".html";
		
		sparkreport=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/Extent Reports/"+repName);
		try {
			sparkreport.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml/");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sparkreport.config().setDocumentTitle("InetBankingProject");
		sparkreport.config().setReportName("Functional Test Report");
		sparkreport.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(sparkreport);
		report.setSystemInfo("HostName", "localHost");
		report.setSystemInfo("Environment", "QA");
		report.setSystemInfo("User", "Rohit Srivastava");
		
		
	}
	
	public static void tearDownExtent() {
		report.flush();
	}
	

}
