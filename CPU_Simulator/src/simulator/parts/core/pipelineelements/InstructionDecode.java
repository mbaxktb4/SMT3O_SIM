package simulator.parts.core.pipelineelements;

import simulator.ISA.BaseInstruction;
import simulator.ISA.ITypeInstruction;
import simulator.ISA.RTypeInstruction;
import simulator.ISA.I.ISA_LW;
import simulator.ISA.R.*;
import simulator.parts.core.Registers;


/**
 * Instruction decode
 * @author Tim
 *
 */
public class InstructionDecode {

	private static final String R_TYPE = "000000";
	private static final String I_TYPE_LW = "100011";
	
	public InstructionDecode(){
		
	}
	
	/**
	 * @param ins
	 * @return
	 */
	public BaseInstruction instructionDecode(String ins){
		// Process types
		
		// Pipeline bubble/idle cpu
		if(ins == null)
			return null;
		
		// Now we do the decode... We first have to get the opCode
		String opCode = ins.substring(0, 6);
		// If it is
//		System.out.println(opCode);
		BaseInstruction decodedInstruction = null;
		switch (opCode) {
		case R_TYPE:
			decodedInstruction = decodeRTypeInstruction(ins);
			break;

		case I_TYPE_LW:
			decodedInstruction = decodeITypeInstructionLW(ins);
			
			break;
			
		default:
			break;
		}
		
		


		return decodedInstruction;
	}
	

	private static final String ADD = "100000";
	private static final String SUB = "100010";

	private static final String MUL = "011000";
	private static final String DIV = "011010";
	
	
	private RTypeInstruction decodeRTypeInstruction(String ins){
		// Return Value
		RTypeInstruction decodedIns = null;
		
		// Take the funct to determine the actual instruction
		// The specific classes will fill in the OPCODE and FUNCT for us in their constructor. Cut down the code base size.
		String funct = ins.substring(26,32);
		switch (funct) {
		case ADD:
			decodedIns = new ISA_Add();
			decodedIns.description();
			break;

		case SUB:
			decodedIns = new ISA_Sub();
			decodedIns.description();
			break;
			
		case MUL:
			decodedIns = new ISA_Mul();
			decodedIns.description();
			break;	
			
		case DIV:
			decodedIns = new ISA_Div();
			decodedIns.description();
			break;
			
		default:
			break;
		}
		

		// RS
		String rs = ins.substring(6, 11);
		Integer intrs = Integer.parseInt(rs,2);
		// Find the register values
		decodedIns.setRS(Registers.getRegisters().getRegister(intrs).getVal());
		
		// RT
		String rt = ins.substring(11, 16);
		Integer intrt = Integer.parseInt(rt,2);
		// Find the register values
		decodedIns.setRT(Registers.getRegisters().getRegister(intrt).getVal());
		
		// RD
		String rd = ins.substring(16, 21);
		Integer intrd = Integer.parseInt(rd,2);
		// Find the register position
		decodedIns.setRDLocation(intrd);
		
		// Shamt
		String shamt = ins.substring(21,26);
		Integer intshamt = Integer.parseInt(shamt,2);
		decodedIns.setShamt(intshamt);

		return decodedIns;
	}
	

	
	private ITypeInstruction decodeITypeInstructionLW(String ins){

		ITypeInstruction decodedIns = null;
		
		decodedIns = new ISA_LW();
		
		String rs = ins.substring(6, 11);
		Integer intrs = Integer.parseInt(rs,2);
		// Find register to do something to
		decodedIns.setRS(intrs);
		
		// RT - Where we are copying to
		String rt = ins.substring(11, 16);
		Integer intrt = Integer.parseInt(rt,2);
		decodedIns.setRT(intrt);
		
		String imm = ins.substring(16, 32);
//		Integer intimm = Integer.parseInt(imm,2);
		decodedIns.setImmidiate(imm);
//		System.out.println("aaa"+imm);
		return decodedIns;
	}
	
}