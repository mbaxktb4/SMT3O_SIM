package simulator.parts.core;

public class Core {


	protected Core(){}
	
	
	
	/**
	 * Static singleton stuff. Hidden out of the way down here
	 */
	
	private static Core mCore;   
	public static Core getCore(){
		if(mCore == null){
			mCore= new Core();
		}
		return mCore;
	}    
}