package simulator.parts.core;

public class Settings {

	private double mClockSpeed = 10.0;// in Hz
	
	

	protected Settings(){
	}
	
	
	public double getClockSpeed(){
		return this.mClockSpeed;
	}
	
	
	/**
	 * Static singleton stuff. Hidden out of the way down here
	 */
	
	private static Settings mSettings;   
	public static Settings getSettings(){
		if(mSettings == null){
			mSettings= new Settings();
		}
		return mSettings;
	}	
}