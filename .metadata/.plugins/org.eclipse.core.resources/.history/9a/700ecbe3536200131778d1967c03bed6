package simulator.parts.core;

import simulator.ISA.BaseInstruction;
import simulator.parts.core.pipelineelements.Execution;
import simulator.parts.core.pipelineelements.InstructionDecode;
import simulator.parts.core.pipelineelements.InstructionFetch;
import simulator.parts.core.pipelineelements.ProgramCounter;
import simulator.parts.core.pipelineelements.WriteBack;

public class Pipeline {
	
	ProgramCounter 		mProgramCounter;
	InstructionFetch 	mInstructionFetch;
	InstructionDecode 	mInstructionDecode;
	Execution 			mExecution;
	WriteBack			mWriteBack;
	
	public Pipeline(){
		this.mProgramCounter 		= new ProgramCounter();
		this.mInstructionFetch 		= new InstructionFetch();
		this.mInstructionDecode 	= new InstructionDecode();
		this.mExecution 			= new Execution();
		this.mWriteBack				= new WriteBack();
		
	}
	
	// Pipeline stages
	
	// Ins Fetch
	
	// Instruction Decode
	
	// Execute
	
	// Data Access
	
	// Write Back
	
	
	
	private String 				mInputID; 
	private BaseInstruction 	mInputEX;
	private BaseInstruction		mInputWB;
	
	
	public void clockTick(){
		
		// During a clock tick we execute each 5 parts of the pipeline.
		
		// We execute each stage. Then after this we ready each output towards the next Stage
		
		// Goes to fetch our instruction
		String outputIF = this.mInstructionFetch.instructionFetch(this.mProgramCounter.getPC());
		
		// Decodes the instruction
		BaseInstruction outputID = this.mInstructionDecode.instructionDecode(this.mInputID);

		// Executes the instruction
		BaseInstruction outputEX = this.mExecution.execute(mInputEX);
		
		
		// 
		
		// Write Back
		this.mWriteBack.writeBack(mInputWB);
		
		
//		this.mProgramCounter.update();
		
		// Retrieved Instruction
//		BaseInstruction instructionFetched = this.mInstructionFetch.instructionFetch(this.mProgramCounter.getPC());
		
		// Instruction Decode
		
		// move items to next stage
		this.mInputID = outputIF;
		this.mInputEX = outputID;
		this.mInputWB = outputEX;
		
		// Increment the program counter
		// May need to perform checks to see if we need to branch etc
		this.mProgramCounter.update();
	}
}
