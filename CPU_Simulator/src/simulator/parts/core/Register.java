package simulator.parts.core;

public class Register {

	private int regVal;
	
	public Register(){
		this.regVal = 0;
	}
	
	public int getVal(){
		return regVal;
	}
	
	public void setRegister(int obj){
		regVal = obj;
	}
}
