package junitclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class sample {
	@Before
	public void beforeCase() {
		System.out.println("welcome to junit");
	}
	@Test
	public void testCase() {
		System.out.println("This test case");
	}
	@After 
	public void afterCase() {
		System.out.println("thanks you");
	}
}
