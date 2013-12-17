package simulator.parts.core.pipelineelements;

import simulator.parts.core.Settings;

/**
 * Handles events to do with load/store.
 * This does so because we are simulating the latency of load/store events.
 * @author Tim
 *
 */
public class MemoryTransferSim {

	private long mPCElapse;
	private int mValueToAdd;
	private int mRegisterToAddTo;
	
	public MemoryTransferSim(int valueAdd, int registerAdd){
		mPCElapse = Settings.getSettings().getMemToRegLatency() *4;
		this.mValueToAdd = valueAdd;
		this.mRegisterToAddTo = registerAdd;
	}
	
	
	public boolean update(){
		
		
		if(mPCElapse <= 0){
			// We have returned the values from memory.
			
			// Now we need to writeback
			
			
			// Should i stall?
			return false;
			
		}
		
		System.out.println("stalling!");
		

		this.mPCElapse -= 4;
		// Should i stall?
		return true;
	}
}
