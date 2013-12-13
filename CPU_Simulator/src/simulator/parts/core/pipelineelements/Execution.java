package simulator.parts.core.pipelineelements;

import simulator.ISA.BaseInstruction;
import simulator.ISA.RTypeInstruction;
import simulator.parts.functionalunits.FunctionalUnit_ALU;

public class Execution {
	
	private FunctionalUnit_ALU mALU1;
	private FunctionalUnit_ALU mALU2;
	private FunctionalUnit_ALU mALU3;
	
	
	
	public Execution(){
		mALU1 = new FunctionalUnit_ALU();
		mALU2 = new FunctionalUnit_ALU();
		mALU3 = new FunctionalUnit_ALU();
	}
	
	public BaseInstruction execute(BaseInstruction ins){
		
		if(ins == null)
			return null;
		
		
		
		// Process instructions here
		if(ins.getOpType() == "R"){
			System.out.println("Executing R Type instruction");
			return mALU1.calculate((RTypeInstruction) ins);
		}
		
		
		// TODO Do alu's properly... Funct units
		// Currently just going to do basic stuff
		
		// Instruction not executed
		System.out.println("Warning: instruction not fully executed!");
		return null;
	}
}
