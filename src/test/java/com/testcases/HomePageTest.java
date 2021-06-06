package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.base.Base;
import com.commonactions.Commonactions;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utility.ExtentManager;
import com.utility.Log;

public class HomePageTest extends Base{

	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	
	@Test(groups= {"E2E", "Smoke"})
	public void testDashboardUI() {
		
		LoginPage loginpage = new LoginPage();
		
		homepage = loginpage.validateLoginFunction();
		/*
		 * //Verify Dashboard Header UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Dashboard header");
		 * Assert.assertTrue(homepage.dashboardHeaderVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Dashboard header displayed successfully");
		 * 
		 * //Verify Quick launch section UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Quick launch section");
		 * Assert.assertTrue(homepage.quickLaunchSectionVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Quick launch section displayed successfully");
		 * 
		 * //Verify assign leave menu UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of assign leave menur");
		 * Assert.assertTrue(homepage.assignLeaveMenuVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "assign leave menu displayed successfully");
		 * 
		 * //Verify Leave list UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Leave list");
		 * Assert.assertTrue(homepage.leaveListMenuVisibility());
		 * ExtentManager.test.log(Status.PASS, "Leave list displayed successfully");
		 * 
		 * //Verify Timesheets option UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Timesheets option");
		 * Assert.assertTrue(homepage.timesheetsMenuVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Timesheets option displayed successfully");
		 * 
		 * //Verify Apply leave option UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Apply leave option");
		 * Assert.assertTrue(homepage.applyLeaveMenuVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Apply leave option displayed successfully");
		 * 
		 * //Verify My leave option UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of My leave option");
		 * Assert.assertTrue(homepage.myLeaveMenuVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "My leave option displayed successfully");
		 * 
		 * //Verify My Timesheet option UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of My Timesheet option");
		 * Assert.assertTrue(homepage.myTimesheetMenuVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "My Timesheet option displayed successfully");
		 * 
		 * //Verify Employee Distribution by Subunit section UI
		 * ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Employee Distribution by Subunit section");
		 * Assert.assertTrue(homepage.empDistributionSectionVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Employee Distribution by Subunit section displayed successfully");
		 * 
		 * //Verify Employee Distribution by Subunit Title UI
		 * ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Employee Distribution by Subunit Title");
		 * Assert.assertTrue(homepage.empDistributionTitleVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Employee Distribution by Subunit Title displayed successfully");
		 * 
		 * //Verify Employee Distribution by Subunit Pie Chart UI
		 * ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Employee Distribution by Subunit Pie Chart");
		 * Assert.assertTrue(homepage.empDistributionPieChartVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Employee Distribution by Subunit Pie Chart displayed successfully");
		 * 
		 * //Verify Legend section UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Legend section");
		 * Assert.assertTrue(homepage.legendSectionVisibility());
		 * ExtentManager.test.log(Status.PASS, "Legend section displayed successfully");
		 * 
		 * //Verify Legend Title UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Legend Title");
		 * Assert.assertTrue(homepage.legendTitleVisibility());
		 * ExtentManager.test.log(Status.PASS, "Legend Title displayed successfully");
		 * 
		 * //Verify Legend section contents UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Legend section contents");
		 * Assert.assertTrue(homepage.legendContentsVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Legend section contents displayed successfully");
		 * 
		 * //Verify Pending Leave Requests section UI
		 * ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Pending Leave Requests section");
		 * Assert.assertTrue(homepage.pendingLeaveReqSectionVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Pending Leave Requests section displayed successfully");
		 * 
		 * //Verify Pending Leave Requests Title UI ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Pending Leave Requests Title");
		 * Assert.assertTrue(homepage.pendingLeaveTitleVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Pending Leave Requests Title displayed successfully");
		 * 
		 * //Verify Pending Leave Requests contents UI
		 * ExtentManager.test.log(Status.INFO,
		 * "Checking for Visibility Of Pending Leave Requests contents");
		 * Assert.assertTrue(homepage.pendingLeaveReqContentsVisibility());
		 * ExtentManager.test.log(Status.PASS,
		 * "Pending Leave Requests contents displayed successfully");
		 */
	}
	
	@Test(groups= {"Sanity", "E2E"})
	public void testNavigateToAssignLeavePage() {
		/*
		 * 
		 * LoginPage loginpage = new LoginPage();
		 * 
		 * homepage = loginpage.validateLoginFunction();
		 * 
		 * homepage.clickAssignLeave();
		 * 
		 * leavepage = new LeavePage();
		 * 
		 * ExtentManager.test.log(Status.INFO,
		 * "Checking for Assign Leave tab selected");
		 * Assert.assertTrue(leavepage.checkSelectedTab().contains(Commonactions.
		 * selectedElementClr)); ExtentManager.test.log(Status.PASS,
		 * "Assign Leave tab selected successfully");
		 */}

	@Test(groups= {"Sanity", "E2E"})
	public void testNavigateToLeaveListPage() {
		/*
		 * LoginPage loginpage = new LoginPage();
		 * 
		 * homepage = loginpage.validateLoginFunction();
		 * 
		 * homepage.clickLeaveList();
		 * 
		 * leavepage = new LeavePage(); ExtentManager.test.log(Status.INFO,
		 * "Checking for Leave List tab selected");
		 * Assert.assertTrue(leavepage.checkSelectedTab().contains(Commonactions.
		 * selectedElementClr)); ExtentManager.test.log(Status.PASS,
		 * "Leave List tab selected successfully");
		 */}
	
	@Test(groups= {"Sanity", "E2E"})
	public void testNavigateToTimesheetsPage() {
		/*
		 * LoginPage loginpage = new LoginPage();
		 * 
		 * homepage = loginpage.validateLoginFunction();
		 * 
		 * homepage.clickTimesheets();
		 * 
		 * leavepage = new LeavePage();
		 * 
		 * ExtentManager.test.log(Status.INFO, "Checking for element selected");
		 * Assert.assertTrue(leavepage.checkSelectedTab().contains(Commonactions.
		 * selectedElementClr)); ExtentManager.test.log(Status.PASS,
		 * "element selected successfully");
		 */}

	@Test(groups= {"Sanity", "E2E"})
	public void testNavigateToApplyLeavePage() {
		/*
		 * LoginPage loginpage = new LoginPage();
		 * 
		 * homepage = loginpage.validateLoginFunction();
		 * 
		 * homepage.clickApplyLeave();
		 * 
		 * leavepage = new LeavePage(); ExtentManager.test.log(Status.INFO,
		 * "Checking for element selected");
		 * Assert.assertTrue(leavepage.checkSelectedTab().contains(Commonactions.
		 * selectedElementClr)); ExtentManager.test.log(Status.PASS,
		 * "element selected successfully");
		 * 
		 */}

	@Test(groups= {"Sanity", "E2E"})
	public void testNavigateToMyLeavePage() {
		/*
		 * LoginPage loginpage = new LoginPage(); homepage =
		 * loginpage.validateLoginFunction();
		 * 
		 * homepage.clickMyLeave();
		 * 
		 * leavepage = new LeavePage();
		 * 
		 * ExtentManager.test.log(Status.INFO, "Checking for element selected");
		 * Assert.assertTrue(leavepage.checkSelectedTab().contains(Commonactions.
		 * selectedElementClr)); ExtentManager.test.log(Status.PASS,
		 * "element selected successfully");
		 */}

	
	@Test(groups= {"Sanity", "E2E"})
	public void testNavigateToMyTimesheet() {
		/*
		 * LoginPage loginpage = new LoginPage();
		 * 
		 * homepage = loginpage.validateLoginFunction();
		 * 
		 * homepage.clickMyTimesheet();
		 * 
		 * leavepage = new LeavePage(); ExtentManager.test.log(Status.INFO,
		 * "Checking for element selected");
		 * Assert.assertTrue(leavepage.checkSelectedTab().contains(Commonactions.
		 * selectedElementClr)); ExtentManager.test.log(Status.PASS,
		 * "element selected successfully");
		 */}

}
