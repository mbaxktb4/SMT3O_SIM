package simulator.parts.core.pipelineelements;

import simulator.ISA.BaseInstruction;
import simulator.ISA.ITypeInstruction;
import simulator.ISA.RTypeInstruction;
import simulator.parts.core.Registers;

public class WriteBack {

	
	public void writeBack(BaseInstruction ins){
		if(ins != null){
			
			if(ins.getOpType() == "R"){
				
				// Write this back
				
				RTypeInstruction instruction = (RTypeInstruction) ins;
	
				// Writes the output to the register
				Registers.getRegisters().getRegister(
				instruction.getRDLocation()).setRegister(instruction.getRDVal());
	
				
				
				System.out.println("ins" + Registers.getRegisters().getRegister(instruction.getRDLocation()).getVal()
						);
				//TODO what if no writeback is needed
				//TODO this will be existing but may not need the writeback
				
			}
			else if(ins.getOpType() == "I"){
				
				ITypeInstruction instruction = (ITypeInstruction) ins;
	
//				// Writes the output to the register
//				Registers.getRegisters().getRegister(
//				instruction.getRDLocation()).setRegister(instruction.getRDVal());
//	
				Registers.getRegisters().getRegister(instruction.getRTVal()).setRegister(
						Integer.parseInt(instruction.getImmidiate(),2)
						);
				
				System.out.println("ins" + Registers.getRegisters().getRegister(instruction.getRTVal()).getVal()
						);
			}
		}
		
	}
	
}
