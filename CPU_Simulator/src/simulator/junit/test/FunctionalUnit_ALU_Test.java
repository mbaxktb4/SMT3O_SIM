package simulator.junit.test;
import static org.junit.Assert.*;

import org.junit.Test;

import simulator.parts.core.Register;
import simulator.parts.functionalunits.FunctionalUnit_ALU;


public class FunctionalUnit_ALU_Test {

	/**
	 * Tests ALU basic Arithmetic
	 * Takes 2 basic integers. Feeds them into registers and runs through ALU
	 * Output of ALU should be the same as the first register.
	 */
	@Test 
	public void testAdd() {
		int val1 = 5;
		int val2 = 6;

		Register a = new Register();
		Register b = new Register();
		Register c = new Register();
		b.setRegister(new Integer(val1));
		c.setRegister(new Integer(val2));
		FunctionalUnit_ALU alu = new FunctionalUnit_ALU();
		alu.add(a, b, c);
		assertEquals(val1+val2, a.getVal());
	}
	
	@Test 
	public void testAddi() {
		int val1 = 5;
		int val2 = 6;

		Register a = new Register();
		Register b = new Register();
		b.setRegister(new Integer(val1));
		
		FunctionalUnit_ALU alu = new FunctionalUnit_ALU();
		alu.addi(a, b, val2);
		assertEquals(val1+val2, a.getVal());
	}
	
	@Test 
	public void testSub() {
		int val1 = 5;
		int val2 = 6;

		Register a = new Register();
		Register b = new Register();
		Register c = new Register();
		b.setRegister(new Integer(val1));
		c.setRegister(new Integer(val2));
		FunctionalUnit_ALU alu = new FunctionalUnit_ALU();
		alu.sub(a, b, c);
		assertEquals(val1-val2, a.getVal());
	}
}
