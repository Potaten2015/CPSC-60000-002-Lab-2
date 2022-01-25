
public class WhiteTubePartFactory extends TubePartFactory {
	
	public Cap createCap() {
		Cap cap = new WhiteCap();
		return cap;
	}
	
	public Body createBody() {
		Body body = new WhiteBody((double) 8);
		return body;
	}

}
