package simulator.ISA;

public abstract class ITypeInstruction extends BaseInstruction {
		protected int mRS;
		protected int mRT;
		protected String mImmediate;

		public ITypeInstruction(){
			this.mOpType = "I";
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
		
		public void setImmidiate(String immediate){
			this.mImmediate = immediate;
		}
		
		public String getImmidiate(){
			return this.mImmediate;
		}
			
}