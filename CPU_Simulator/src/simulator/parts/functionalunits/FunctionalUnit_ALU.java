package simulator.parts.functionalunits;

import simulator.ISA.RTypeInstruction;


public class FunctionalUnit_ALU extends FunctionalUnitBase{

	public FunctionalUnit_ALU(){
		
	}
	
	
	public RTypeInstruction calculate(RTypeInstruction instruction){
		
		if(instruction.getFunct() == "ADD"){
			instruction.setRDVal( instruction.getRSVal() + instruction.getRTVal() );
		}
		else if(instruction.getFunct() == "SUB"){
			
			instruction.setRDVal( instruction.getRSVal() - instruction.getRTVal() );
		}
		else if(instruction.getFunct() == "MUL"){
			
			instruction.setRDVal( instruction.getRSVal() * instruction.getRTVal() );
		}
		else if(instruction.getFunct() == "DIV"){
			instruction.setRDVal( instruction.getRSVal() / instruction.getRTVal() );
		}
		
		return instruction;
	}
	
}