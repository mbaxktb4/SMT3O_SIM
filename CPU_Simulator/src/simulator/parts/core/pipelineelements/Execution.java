package simulator.parts.core.pipelineelements;

import simulator.ISA.BaseInstruction;
import simulator.ISA.RTypeInstruction;

public class Execution {
	public Execution(){
		
	}
	
	public BaseInstruction execute(BaseInstruction ins){
		
		if(ins == null)
			return null;
		
		// TODO Do alu's properly... Funct units
		// Currently just going to do basic stuff
		RTypeInstruction instruction = (RTypeInstruction) ins;
		
		
		instruction.setRDVal( instruction.getRSVal() + instruction.getRTVal() );
		
//		instruction.setRDVal( 5);
		return instruction;
	}
}
