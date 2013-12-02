package simulator.parts.core;

public class Registers {

	private Register[] mGPR = new Register[32];
	
	
	
	public Register getRegister(int i){
		return this.mGPR[i];
	}
	
	private static Registers sRegisters;   
	public static Registers getRegisters(){
		if(sRegisters == null){
			sRegisters= new Registers();
		}
		return sRegisters;
	}
}
