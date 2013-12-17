package simulator.parts.core.pipelineelements;

import simulator.ISA.BaseInstruction;
import simulator.ISA.ITypeInstruction;
import simulator.parts.core.Pipeline;

/**
 * Accessing the data memory
 * @author Tim
 *
 */
public class DataAccess {

	private Pipeline mPipeline;
	private MemoryTransferSim mMemTransfer;
	
	public DataAccess(Pipeline pipe){
		this.mPipeline = pipe;
	}
	
	public BaseInstruction dataAccess(BaseInstruction ins){
	
		if(ins != null){
			requestMemory(ins);
		}
		return ins;
	}
	
	
	
	// Request something to be bought in from memory
	// Add it to memory
	
	public MemoryTransferSim requestMemory(BaseInstruction ins){
		if(ins.getOpType() == "I"){
			// I type.
			
			ITypeInstruction instruction = (ITypeInstruction) ins;			
			// I know this doesn't strictly work as it should. but if you see other
			// comments specifically relating to ISA_LW you will see that I am using
			// the immediate to store the value rather than having to write a memory
			// system.
			// This needs to be stored away.. 
			int valuetoUpload = Integer.parseInt(instruction.getImmidiate(),2);
			System.out.println("Val::::" + valuetoUpload + "  " + instruction.getRTVal());
			mMemTransfer = new MemoryTransferSim(valuetoUpload,
					instruction.getRTVal());
			
			// Stall the pipeline
			
			
			mPipeline.stallForPeriod();
			
			return mMemTransfer;
		}
		return null;
	}
	
	public boolean update(){
		if(mMemTransfer == null){
			return false;
		}
		return mMemTransfer.update();
	}
	
	public void writetoMemory(){
		
	}
	
	
}
