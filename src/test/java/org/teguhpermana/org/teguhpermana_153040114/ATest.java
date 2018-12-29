package org.teguhpermana.org.teguhpermana_153040114;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ATest {
	
	@Test
	public void test1() {
		A a = new A();
		double act = a.hitung(2, 3, 5);
		double exp = 25.0;
		assertEquals(exp, act);
	}
	
	@Test
	public void test2() {
		A a = new A();
		double act = a.hitung(2.1, 3.5, 1.0);
		double exp = 5.6;
		assertEquals(exp, act);
	}
		

}
