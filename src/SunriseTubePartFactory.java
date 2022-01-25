public class SunriseTubePartFactory extends TubePartFactory {
	
	public Cap createCap() {
		Cap cap = new BlueCap();
		return cap;
	}
	
	public Body createBody() {
		Body body = new GoldBody((double) 8);
		return body;
	}
	
	
}
