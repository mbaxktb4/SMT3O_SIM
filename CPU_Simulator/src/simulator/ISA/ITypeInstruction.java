package simulator.ISA;

import simulator.parts.core.Register;

public abstract class ITypeInstruction extends BaseInstruction {
		protected Register mRS;
		protected Register mRT;
		protected String mImmediate;
}
