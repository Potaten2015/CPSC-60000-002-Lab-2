
public class SimpleTubeBuilder extends TubeBuilder {
	
	public Tube createTube(String colors) {
		Tube tube;
		
		if(colors == "cotton candy") {
			tube = new SunblockTube(new CottonCandyTubePartFactory());
		} else if (colors == "sunrise") {
			tube = new SunblockTube(new SunriseTubePartFactory());
		} else if (colors == "blackout") {
			tube = new SunblockTube(new BlackoutTubePartFactory());
		} else {
			tube = new SunblockTube(new WhiteTubePartFactory());
		}
		
		return tube;
		
	}

}
