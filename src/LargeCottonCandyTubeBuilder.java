
public class LargeCottonCandyTubeBuilder extends TubeBuilder {
	
	public LargeCottonCandyTubeBuilder() {}
	
	public Tube createTube() {
		Cap cap = new Cap("pink");
		Body body = new Body("blue", 12);
		return new Tube(cap, body);
	}

}
