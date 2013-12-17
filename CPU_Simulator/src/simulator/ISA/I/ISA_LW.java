package simulator.ISA.I;

import simulator.ISA.ITypeInstruction;
import simulator.parts.core.Settings;

public class ISA_LW extends ITypeInstruction {

	private long mTransferTime;
	
	public ISA_LW(){
		this.mOpCode = "LW";
		// Get the amount of ticks it will take to get copied to memory
		mTransferTime = Settings.getSettings().getMemToRegLatency() *4;
	}
	
	public void TEST_Populate(){
	/*	this.mFetchedRD = 1;
		this.mFetchedRS = 2;
		this.mFetchedRT = 3;
		this.mShamt = 0;*/
		// TODO Test populate
	}
	
	
public boolean update(){
		
		
		if(mTransferTime <= 0){
			// We have returned the values from memory.
			
			// Now we need to writeback
			
			
			// Should i stall?
			return false;
			
		}
		
		System.out.println("stalling!");
		

		this.mTransferTime --;
		// Should i stall?
		return true;
	}
}