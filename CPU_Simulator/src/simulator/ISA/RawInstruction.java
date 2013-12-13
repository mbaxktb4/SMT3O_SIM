package simulator.ISA;

public class RawInstruction {
	

	public String TEST_InsertData_ADD(){
//		// OP CODE 	- 6 bits
//		int incomingOpCode = 2;
//		
//		// RS 		- 5 bits
//		int incomingrs = 3;
//		
//		// RT		- 5 bits
//		int incomingrt = 4;
//		
//		// RD		- 5 bits
//		int incomingrd = 5;
//		
//		// shamt	- 5 bits
//		int incomingshamt = 0;
//		
//		// funct	- 6 bits
//		int incomingfunct = 32;
		
		// An add instruction
		return convertInstructionToBinaryRType(0,3,4,5,0,32);
	}
	
	public String TEST_InsertData_SUB(){

		return convertInstructionToBinaryRType(0,3,4,5,0,34);
	}
	
	public String TEST_InsertData_MUL(){

		return convertInstructionToBinaryRType(0,3,4,5,0,24);
	}
	
	public String TEST_InsertData_DIV(){

		return convertInstructionToBinaryRType(0,3,4,5,0,26);
	}
	
	// I type
	
	public String TEST_InsertData_LW(){
		// Note we only use the immediate here. This is to prevent us building the entire mem architecture. In effect. Were stubbing this
		return convertInstructionToBinaryIType(35,3,0,12345);
	}
	
	
	
	
	
	
	
	private String convertInstructionToBinaryRType(int incomingOpCode, int incomingrs, int incomingrt, int incomingrd, int incomingshamt, int incomingfunct){
		String instruction;
		instruction =	convert(incomingOpCode,		6);
		instruction += 	convert(incomingrs,			5);
		instruction += 	convert(incomingrt,			5);
		instruction += 	convert(incomingrd,			5);
		instruction += 	convert(incomingshamt,		5);
		instruction +=	convert(incomingfunct,		6);
		return instruction;
	}
	
	private String convertInstructionToBinaryIType(int incomingOpCode, int incomingrs, int incomingrt, int incomingImmediate){
		String instruction;
		instruction =	convert(incomingOpCode,		6);
		instruction += 	convert(incomingrs,			5);
		instruction += 	convert(incomingrt,			5);
		instruction += 	convert(incomingImmediate,	16);
		return instruction;
	}
	
	
	private String convert(int incomingCode, int length){
		// Converting OP Code
		String code = Integer.toBinaryString(incomingCode);
		int missingdigits = length - code.length();
		for(;missingdigits>0;missingdigits--){
			code = "0" + code;
		}
		return code;
	}
}