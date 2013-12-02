package simulator.ISA;

import simulator.parts.core.Register;

public abstract class RTypeInstruction extends BaseInstruction {
	protected Register mRS;
	protected Register mRT;
	protected Register mRD;
	protected int mShamt;
	protected int mFunct;
	
	public RTypeInstruction(){
		this.mOpType = "R";
	}
	
	public void description(){
		System.out.println("Op:" + this.mOpCode + " Type:" + this.mOpType + " ");
	}
	
	public void setRS(Register rs){
		this.mRS = rs;
	}
	
	public void setRT(Register rt){
		this.mRT = rt;
	}
	
	public void setRD(Register rd){
		this.mRD = rd;
	}
	
	public void setShamt(int shamt){
		this.mShamt = shamt;
	}
	
	public void setFunct(int funct){
		this.mFunct = funct;
	}
	
}