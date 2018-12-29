package org.teguhpermana.org.teguhpermana_153040114;

public class A {
	
	public double hitung (double a, double b, double c) {
		Argument argA = new Argument("a", a);
		Argument argB = new Argument("a", b);
		Argument argC = new Argument("c", c);
		Expression exp = new Expression ("(a+b)*c", argB, argA, argC);
		return exp.calculate();
	}
}
