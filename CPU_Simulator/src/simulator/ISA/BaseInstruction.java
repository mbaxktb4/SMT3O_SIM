package simulator.ISA;


public abstract class BaseInstruction {
	
	
	protected String mOpCode;		// Opcode to be injected
	protected String mOpType;		// Type R,I,J
	
	
	public String getOpType(){
		return this.mOpType;
	}
}
