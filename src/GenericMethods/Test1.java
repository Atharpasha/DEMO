package GenericMethods;

import org.testng.annotations.Test;

public class Test1 extends Operation {
	@Test
	public void createUserTest() throws Throwable {
		 System.out.println("create"); 	 

	}
	@Test
	public void modifyUserTest() {
		System.out.println("==modify user==");
	}
}