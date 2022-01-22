
public class MediumBlackoutTubeBuilder extends TubeBuilder {
	
	public MediumBlackoutTubeBuilder() {}
	
	public Tube createTube() {
		Cap cap = new Cap("black");
		Body body = new Body("black", 8);
		return new Tube(cap, body);
	}

}

