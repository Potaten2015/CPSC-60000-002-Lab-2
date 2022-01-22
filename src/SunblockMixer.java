
public class SunblockMixer {
	private static SunblockMixer mixer;
	private double totalMixed = 0;
	private double totalLotion = 0;
	private double totalWater = 0;
	private double totalPowder = 0;
	private double requiredLotion = 1;
	private double requiredWater = 1;
	private double requiredPowder = 1;
	
	private SunblockMixer() {};
	
	public static SunblockMixer getMixer() {
		
		if(mixer == null) {
			mixer = new SunblockMixer();
		}
		return mixer;
	}
	
	public void setLotionRatio (double ozLotion) {
		this.requiredLotion = ozLotion;
		System.out.println("Mixer uses " + String.valueOf(this.requiredLotion) + " ounces of lotion for 1 ounce of sunblock.");
	}
	
	public void setWaterRatio (double ozWater) {
		this.requiredWater = ozWater;
		System.out.println("Mixer uses " + String.valueOf(this.requiredWater) + " ounces of water for 1 ounce of sunblock.");
	}
	
	public void setPowderRatio (double ozAntiSunPowder) {
		this.requiredPowder = ozAntiSunPowder;
		System.out.println("Mixer uses " + String.valueOf(this.requiredPowder) + " ounces of Anti Sun Powder for 1 ounce of sunblock.");
	}
	
	public void addLotion (double ozLotion) {
		this.totalLotion = this.totalLotion + ozLotion;
		System.out.println("Total lotion available for mixing: " + String.valueOf(this.totalLotion));
	}
	
	public void addWater(double ozWater) {
		this.totalWater = this.totalWater + ozWater;
		System.out.println("Total water available for mixing: " + String.valueOf(this.totalWater));
	}
	
	public void addPowder(double ozAntiSunPowder) {
		this.totalPowder = this.totalPowder + ozAntiSunPowder;
		System.out.println("Total Anti Sun Powder available for mixing: " + String.valueOf(this.totalPowder));
	}
	
	public double getRequiredLotion() {
		return this.requiredLotion;
	}
	
	public double getRequiredWater() {
		return this.requiredWater;
	}
	
	public double getRequiredPowder() {
		return this.requiredPowder;
	}
	
	public double getTotalMixed() {
		System.out.println("Total sunblock mixed: " + String.valueOf(this.totalMixed));
		return this.totalMixed;
	}
	
	public void mix () {
		double lotionRatio = this.totalLotion / this.requiredLotion;
		double waterRatio = this.totalWater / this.requiredWater;
		double powderRatio = this.totalPowder / this.requiredPowder;
		
		double smallestRatio = Math.round(Math.min(Math.min(lotionRatio, waterRatio), powderRatio));
		this.totalMixed = this.totalMixed + smallestRatio;
		
		double lotionUsed = smallestRatio * this.requiredLotion;
		double waterUsed = smallestRatio * this.requiredWater;
		double powderUsed = smallestRatio * this.requiredPowder;
		
		this.totalLotion = this.totalLotion - lotionUsed;
		this.totalWater = this.totalWater - waterUsed;
		this.totalPowder = this.totalPowder - powderUsed;
		
		System.out.println("Mixed " + String.valueOf(smallestRatio) + " ounces of sunblock for a total of " + String.valueOf(this.totalMixed) + " ounces.");
	}
}
