package simulator.display;

import java.util.ArrayList;

import simulator.parts.core.Pipeline;

public class InformationDisplay {

	private Pipeline mPipeline;
	private ArrayList<String> mPreviousList = new ArrayList<String>();
	
	public InformationDisplay(Pipeline pipeline){
		this.mPipeline = pipeline;
	}
	
	public void display(long pc){
/*		System.out.println("Pipeline Elements in use:");

		System.out.println("  PC  |  IF  |  ID  |  EX  |  FR  |  WB  ");
		System.out.println("-----------------------------------------");
		displayPC(pc);
	*/	
		
	}
	
	private void displayPC(long pc){
		int displayArea = 6;
		int displayUsed = (int) Math.log10(pc+1) + 1;
		int first = 0;
		int last = 0;
		if(displayUsed >= displayArea){
			
		}else{

			first = (displayArea - displayUsed) / 2;
			last = displayArea - (first + displayUsed);
		}
		
		String toPrint = "";
		for(int i = 0; i < first; i++){
			toPrint = toPrint + " ";
		}
		toPrint = toPrint + pc;
		
		for(int i = 0; i < last; i++){
			toPrint = toPrint + " ";
		}
		toPrint = toPrint + "|";
		
		
		
		// Print off the display and ready the surviving parts for the next run.
		System.out.println(toPrint);
		for (String elem : mPreviousList) {
			System.out.println(elem);
		}
		mPreviousList.add(0, toPrint);
		// Add to stored
		if(mPreviousList.size() > 10){
			mPreviousList.remove(mPreviousList.size()-1);
		}
	}
}
