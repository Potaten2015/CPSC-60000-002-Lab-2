
public class SmallSunriseTubeBuilder extends TubeBuilder {
	
	public SmallSunriseTubeBuilder() {}
	
	public Tube createTube() {
		Cap cap = new Cap("orange");
		Body body = new Body("gold", 4);
		return new Tube(cap, body);
	}

}
