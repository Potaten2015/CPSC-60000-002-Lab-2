
public class Lab2Run {

	public static void main(String[] args) {
		// Create and test singleton sunblock mixer class
		SunblockMixer mixer = SunblockMixer.getMixer();
		mixer.setLotionRatio(1);
		mixer.setWaterRatio(1);
		mixer.setPowderRatio(5);
		mixer.addLotion(10);
		mixer.addWater(5);
		mixer.addPowder(10);
		mixer.mix();
		mixer = SunblockMixer.getMixer();
		System.out.println(mixer.getRequiredPowder());
		
		
	}
}
