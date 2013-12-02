package simulator.ISA;

import simulator.parts.core.Register;

public abstract class FRTypeInstruction extends BaseInstruction {
	protected String mFmt;
	protected Register mFT;
	protected Register mFS;
	protected Register mFD;
	protected String mFunct;
}
