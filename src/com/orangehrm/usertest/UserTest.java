package com.orangehrm.usertest;


import org.testng.annotations.Test;

import com.orangehrm.genriclib.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

public class UserTest extends BaseClass {

	
	
		@Test(priority = 1)
		public void createUserTest() {
			test.log(LogStatus.INFO, "Create User");
			System.out.println("===Create User===");
			String propertyFilePath=System.getProperty("usr.dir");
			System.out.println("propertyFilePath="+propertyFilePath);
		
		}
//		@Test(priority = 2)
//		public void modifyUserTest() {
//			test.log(LogStatus.INFO, "Modify User");
//			System.out.println("===Modify User===");
//		}
//		@Test(priority = 3)
//		public void deleteUserTest() {
//			test.log(LogStatus.FAIL, "Delete User");
//			System.out.println("===Delete"
//					+ " User===");
//		}

	}


