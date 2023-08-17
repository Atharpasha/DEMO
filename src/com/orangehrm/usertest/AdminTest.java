package com.orangehrm.usertest;


import org.testng.annotations.Test;

import com.orangehrm.genriclib.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

public class AdminTest extends BaseClass {

//		@Test
		public void createUserTest() throws Throwable {
		String username=getUtilityObject().readExcelData("User", 1, 0);
		String password=getUtilityObject().readExcelData("User", 1, 1);
		String confirmPwd=getUtilityObject().readExcelData("User", 1, 2);
		String empName=getUtilityObject().readExcelData("User", 1, 3);
		test.log(LogStatus.INFO, "Create User");
		//getAdminPage().createUser(username,password,confirmPwd,empName);
		
		}
		@Test
		public void modifyUserTest() throws Throwable {
			String empName=getUtilityObject().readExcelData("User", 1, 3);
			String username=getUtilityObject().readExcelData("User", 1, 0);
			System.out.println("===Modify User===");
			test.log(LogStatus.INFO, "Search User");
			//getAdminPage().searchUser(username, empName);
		}
//		@Test
//		public void deleteUserTest() {
//			System.out.println("===Delete"
//					+ " User===");
//		}
	}


