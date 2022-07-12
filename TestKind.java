package junitclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestKind {
	KindOfNumber k=new KindOfNumber();
	int a = 7;
	@Before
	public void BeforeCase() {
		System.out.println("prime kind num");
	}
	@Test
	public void num() {
		k.num(a);
	}
	@Test
	public void findprime() {
		k.findprime(a);
	}
	@After
	public void AfterCase() {
		System.out.println("end prime");
	}

}
