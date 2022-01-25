public class BlackoutTubePartFactory extends TubePartFactory {
	
	public Cap createCap() {
		Cap cap = new BlackCap();
		return cap;
	}
	
	public Body createBody() {
		Body body = new BlackBody((double) 8);
		return body;
	}
	
	
}