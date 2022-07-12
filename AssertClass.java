package junitclass;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertClass {
	@Before
	public void qwe() {
		System.out.print("Strart");
	}
	@Test
	public void name() {
	String na = "vickey";
	String na1 = "vickey";
	assertEquals(na,na1); 
	System.out.println("true");
	}
	@Test
	public void name1() {
	String ns = "karthi";
	String ns1 = "Vickey";
	assertNotEquals(ns,ns1);
	System.out.println("true");
	}
	@Test
	public void name2() {
		String b1 = null;
		assertNull(b1);
		System.out.println("true");
	}
	@Test
	public void name3() {
		String b2 = "priya";
		assertNotNull(b2);
		System.out.println("true");
	}
	@Test
	public void name4() {
		assertSame("vickey","vickey");
		System.out.println("true");
	}
	@Test
	public void name5() {
		
	assertNotSame("paki","look");
	System.out.println("true");
	}
	@Test
	public void name6() {
		String name = "karthi";
		String name1 = "karthi";
		boolean isTrue = name.equals(name1);
		assertTrue(isTrue);
		System.out.println("true");
	}
	@Test
	public void name7() {
		String name2 = "sudhan";
		String name3 = "vignesh";
		boolean isTrue =  name2.equals(name3);
		assertFalse(isTrue);
		System.out.println("true");
	}
@Test
public void name8() {
	int[] m1 = {1,2,3};
	int[] m2 = {1,2,3};
	assertArrayEquals(m1,m2);
	System.out.println("true");
}
@After
public void name9() {
	System.out.println("end");
}
}
