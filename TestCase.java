package junitclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class TestCase {
	Calculation ca1 = new Calculation();
	@Before
	public void BeforeCase() {
		System.out.println("test");
	}
	@Test
	public void add() {
		ca1.add();
	}
	@Test
	public void sub() {
		ca1.sub();
	}
	@Test
	public void div() {
		ca1.div();
	}
	@Test
	public void mul() {
		ca1.mul();
	}
	@After
	public void AfterCase() {
		System.out.println("fishing");
	}

}
