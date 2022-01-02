package com.bl.userentry_junit_testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UserEntryTesting {

	@Test
	public void userTest() {
		UserEntry userEntry = new UserEntry();
		assertEquals("Rajshekar", userEntry.firstName("Rajshekar"));
		assertEquals("Reddy", userEntry.lastName("Reddy"));
		assertEquals("9999977777 ", userEntry.contactNumber("9999977777"));
		assertEquals("raj@gmail.com" ,userEntry.emailID("raj@gmail.com"));
	}

}
