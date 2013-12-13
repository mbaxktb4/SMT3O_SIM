package simulator.ISA;

public abstract class RTypeInstruction extends BaseInstruction {
	protected int mRS;
	protected int mRT;
	protected int mRDVal;
	protected int mRDLocation;
	protected int mShamt;
	protected int mFunct;
	
	public RTypeInstruction(){
		this.mOpType = "R";
	}
	
	public void description(){
		System.out.println("Op:" + this.mOpCode + " Type:" + this.mOpType + " ");
	}
	
	public void setRS(int rs){
		this.mRS = rs;
	}
	
	public int getRSVal(){
		return this.mRS;
	}
	
	public void setRT(int rt){
		this.mRT = rt;
	}
	
	public int getRTVal(){
		return this.mRT;
	}
	
	public void setRDVal(int rd){
		this.mRDVal = rd;
	}
	
	public int getRDVal(){
		return this.mRDVal;
	}
	
	public void setRDLocation(int rd){
		this.mRDLocation = rd;
	}
	
	public int getRDLocation(){
		return this.mRDLocation;
	}
	
	public void setShamt(int shamt){
		this.mShamt = shamt;
	}
	
	public void setFunct(int funct){
		this.mFunct = funct;
	}
	
	public String getFunct(){
		return this.mOpType;
	}
}