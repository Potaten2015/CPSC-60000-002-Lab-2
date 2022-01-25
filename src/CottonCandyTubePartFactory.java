
public class CottonCandyTubePartFactory extends TubePartFactory {
	
	public Cap createCap() {
		Cap cap = new PinkCap();
		return cap;
	}
	
	public Body createBody() {
		Body body = new BlueBody((double) 8);
		return body;
	}
	
	
	
}
