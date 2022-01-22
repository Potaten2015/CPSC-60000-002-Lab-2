import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Lab2Tests {
	@Test
	public void TestSunblockMixer() {
		SunblockMixer mixer = SunblockMixer.getMixer();
		mixer.setLotionRatio(1);
		mixer.setWaterRatio(1);
		mixer.setPowderRatio(1);
		assertEquals(1, mixer.getRequiredLotion(), 0.0);
		mixer.addLotion(10);
		mixer.addWater(5);
		mixer.addPowder(2);
		mixer.mix();
		assertEquals(2, mixer.getTotalMixed(), 0.0);
	}
	
}
