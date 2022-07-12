package junitclass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample3 {
	sample2 sa = new sample2();
	String [] a = {"ram","raj","ashok"};
@Before
public void sa() {
	System.out.println("staert");
}
@Test
public void name() {
	assertEquals(sa.name(a),"ASHOK");
	System.out.println("equals");
}
@Test
public void notnull() {
	assertNotNull(sa.name(a));
	System.out.println("not null");
}
@After
public void na() {
	System.out.println("finish");
}
}
