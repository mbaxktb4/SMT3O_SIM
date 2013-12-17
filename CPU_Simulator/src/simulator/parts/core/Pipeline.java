package simulator.parts.core;

import simulator.ISA.BaseInstruction;
import simulator.display.InformationDisplay;
import simulator.parts.core.pipelineelements.Execution;
import simulator.parts.core.pipelineelements.InstructionDecode;
import simulator.parts.core.pipelineelements.InstructionFetch;
import simulator.parts.core.pipelineelements.DataAccess;
import simulator.parts.core.pipelineelements.ProgramCounter;
import simulator.parts.core.pipelineelements.WriteBack;

public class Pipeline {
	
	private boolean mStall = false;
	
	ProgramCounter 		mProgramCounter;
	InstructionFetch 	mInstructionFetch;
	InstructionDecode 	mInstructionDecode;
	Execution 			mExecution;
	DataAccess			mDataAccess;
	WriteBack			mWriteBack;
	
	InformationDisplay mInformationDisplay;
	
	public Pipeline(){
		this.mProgramCounter 		= new ProgramCounter();
		this.mInstructionFetch 		= new InstructionFetch();
		this.mInstructionDecode 	= new InstructionDecode();
		this.mExecution 			= new Execution();
		this.mDataAccess			= new DataAccess(this);
		this.mWriteBack				= new WriteBack();
		
		this.mInformationDisplay	= new InformationDisplay(this);
	}
	
	// Pipeline stages
	
	// Ins Fetch
	
	// Instruction Decode
	
	// Execute
	
	// Data Access
	
	// Write Back
	
	
	
	private String 				mInputID; 
	private BaseInstruction 	mInputEX;
	private BaseInstruction		mInputDA;
	private BaseInstruction		mInputWB;
	
	
	public void clockTick(){
		
		// Clock tick
		// First stage. Fetch instruction
		// If we are using SMT we will need more than 1 fetch and program counter. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// During a clock tick we execute each 5 parts of the pipeline.
		
		// We execute each stage. Then after this we ready each output towards the next Stage
//		if(!this.mStall){
			// Goes to fetch our instruction
			String outputIF = this.mInstructionFetch.instructionFetch(this.mProgramCounter.getPC());
			
			// Decodes the instruction
			BaseInstruction outputID = this.mInstructionDecode.instructionDecode(this.mInputID);
	
			
			
			
			
			// Executes the instruction
			BaseInstruction outputEX = this.mExecution.execute(mInputEX);
			
			BaseInstruction outputDA = this.mDataAccess.dataAccess(mInputDA);
			
			
			
			
			
			
			
			// Write Back
			this.mWriteBack.writeBack(mInputWB);
			
			this.mInformationDisplay.display(this.mProgramCounter.getPC());
			
	//		this.mProgramCounter.update();
			
			// Retrieved Instruction
	//		BaseInstruction instructionFetched = this.mInstructionFetch.instructionFetch(this.mProgramCounter.getPC());
			
			// Instruction Decode
			
			// move items to next stage
			this.mInputID = outputIF;
			this.mInputEX = outputID;
			this.mInputDA = outputEX;
			this.mInputWB = outputDA;
			
			
		
			// Increment the program counter
			// May need to perform checks to see if we need to branch etc
			this.mProgramCounter.update();
//		}
		
		
		this.mStall = this.mDataAccess.update();
		
		
	}
	
	public void stallForPeriod(){
		this.mStall = true;
	}
}
