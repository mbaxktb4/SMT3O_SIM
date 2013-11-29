package simulator.parts.functionalunits;

import simulator.parts.core.Register;

public class FunctionalUnit_ALU extends FunctionalUnitBase{

	public void add(Register $a, Register $b){
		
		$a.setRegister(
				((Integer) $a.getVal()).intValue() + 
				((Integer) $b.getVal()).intValue()
				);
	}
}
