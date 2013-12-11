package simulator.display;

import simulator.parts.core.Pipeline;

public class InformationDisplay {

	private Pipeline mPipeline;
	
	public InformationDisplay(Pipeline pipeline){
		this.mPipeline = pipeline;
	}
	
	public void display(long pc){
		System.out.println("Pipeline Elements in use:");

		System.out.println("  PC  |  IF  |  ID  |  EX  |  FR  |  WB  ");
		System.out.println("-----------------------------------------");
		displayPC(pc);
		
		
	}
	
	private void displayPC(long pc){
		int displayArea = 6;
		int displayUsed = (int) Math.log10(pc+1) + 1;
		
		
		
		
		
		System.out.println(displayUsed+"");
	}
}
