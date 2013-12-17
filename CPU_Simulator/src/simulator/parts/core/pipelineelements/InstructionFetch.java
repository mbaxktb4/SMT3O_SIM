package simulator.parts.core.pipelineelements;

import simulator.ISA.RawInstruction;


public class InstructionFetch {

	
	public String instructionFetch(long pPC){
		// Get the instruction at PC.
		
		// We have a pointer. We should access stuff at this point
		if(pPC == 22){

			System.out.println("Fetching Instruction");
			
			// Getting a test instruction here
			RawInstruction rawInstruction = new RawInstruction();
			return rawInstruction.TEST_InsertData_ADD();
		}
		if(pPC == 24){

			System.out.println("Fetching Instruction");
			// Getting a test instruction here
			RawInstruction rawInstruction = new RawInstruction();
			return rawInstruction.TEST_InsertData_SUB();
		}
		
		if(pPC == 36){

			System.out.println("Fetching Instruction");
			// Getting a test instruction here
			RawInstruction rawInstruction = new RawInstruction();
			return rawInstruction.TEST_InsertData_DIV();
		}
		
		if(pPC == 48){

			System.out.println("Fetching Instruction");
			// Getting a test instruction here
			RawInstruction rawInstruction = new RawInstruction();
			return rawInstruction.TEST_InsertData_MUL();
		}
		
		if(pPC == 12){

			System.out.println("Fetching Instruction");
			// Getting a test instruction here
			RawInstruction rawInstruction = new RawInstruction();
			return rawInstruction.TEST_InsertData_LW();
		}
		//TODO get logic.
		
		//TODO get basic instruction here
		
		// TODO get from instruction register?
		
		// Pipeline bubble
		return null;
	}
}
