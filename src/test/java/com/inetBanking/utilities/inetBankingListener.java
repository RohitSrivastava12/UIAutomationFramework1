package com.inetBanking.utilities;

import java.io.File;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class inetBankingListener extends inetBankingExtentManager implements ITestListener {

	public void onTestSuccess(ITestResult tr) {
		test = report.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));

	}

	public void onTestFailure(ITestResult tr) {
		test = report.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));

		String screenshotPath = System.getProperty("user.dir") + "/Screenshots" + tr.getName() + ".png";
		File f = new File(screenshotPath);
		if (f.exists()) {
			test.fail("Screenshot is below " + test.addScreenCaptureFromPath(screenshotPath));
		}

	}

	public void onTestSkipped(ITestResult tr) {
		test = report.createTest(tr.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));

	}

}
