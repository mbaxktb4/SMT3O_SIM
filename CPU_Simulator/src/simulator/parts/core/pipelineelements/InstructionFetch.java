package simulator.parts.core.pipelineelements;

import simulator.ISA.RawInstruction;


public class InstructionFetch {

	
	public String instructionFetch(long pPC){
		// Get the instruction at PC.
		
		// We have a pointer. We should access stuff at this point
		if(pPC == 12){

			// Getting a test instruction here
			RawInstruction rawInstruction = new RawInstruction();
			return rawInstruction.TEST_InsertData_ADD();
		}
		
		
		//TODO get logic.
		
		//TODO get basic instruction here
		
		// TODO get from instruction register?
		
		// Pipeline bubble
		return null;
	}
}
