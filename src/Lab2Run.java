
/**
 * Demonstrates successful use of factory and singleton design patterns
 * @author tatenknight
 */
public class Lab2Run {

	public static void main(String[] args) {
		// Create and use singleton sunblock mixer class
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
		System.out.println("");
		
		// Create and use various sunblock builder factories
		TubeBuilder cottonCandyBuilder = new LargeCottonCandyTubeBuilder();
		TubeBuilder blackoutBuilder = new MediumBlackoutTubeBuilder();
		TubeBuilder sunriseBuilder = new SmallSunriseTubeBuilder();
		
		cottonCandyBuilder.buildTube();
		blackoutBuilder.buildTube();
		sunriseBuilder.buildTube();
		
		Tube blackoutTube = blackoutBuilder.buildTube();
		Body blackoutTubeBody = blackoutTube.getBody();
		System.out.println(blackoutTubeBody.getColor());
		System.out.println(blackoutTubeBody.getSize());
		
	}
}
