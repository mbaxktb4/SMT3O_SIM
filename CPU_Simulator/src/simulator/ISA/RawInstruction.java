package simulator.ISA;

public class RawInstruction {
	
	/**
	 * IMPORTANT:
	 * I don't like the endian scheme of MIPS. So i'm going to be following little endian
	 * @return
	 */
	
	public String TEST_InsertData_ADD(){
//		// OP CODE 	- 5 bits
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
		return convertInstructionToBinary(0,3,4,5,0,32);
	}
	
	
	private String convertInstructionToBinary(int incomingOpCode, int incomingrs, int incomingrt, int incomingrd, int incomingshamt, int incomingfunct){
		String instruction;
		instruction =	convert(incomingOpCode,	6);
		instruction += 	convert(incomingrs,		5);
		instruction += 	convert(incomingrt,		5);
		instruction += 	convert(incomingrd,		5);
		instruction += 	convert(incomingshamt,	5);
		instruction +=	convert(incomingfunct,	6);
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