package simulator.ISA;

import simulator.parts.core.Register;

public abstract class FITypeInstruction extends BaseInstruction {
	protected String mFmt;
	protected Register mFT;
	protected String mImmediate;
}
