
public abstract class Tube {
	private Cap cap;
	private Body body;
	
	public Tube(Cap cap, Body body) {
		this.cap = cap;
		this.body = body;
	}
	
	public void describe() {
		System.out.println(this.cap.getColor() + " cap, " + this.body.getColor() + " body, " + String.valueOf(this.body.getSize()) + " oz.");
	}
	
	public void fill() {
		System.out.println("Filling " + this.body.getColor() + " tube with " + this.body.getSize() + " ounces of sunblock.");
	}
	
	public void seal() {
		System.out.println("Sealing and putting " + this.cap.getColor() + " cap on " + this.body.getColor() + " body.");
	}
	
	public Cap getCap() {
		return this.cap;
	}
	
	public Body getBody() {
		return this.body;
	}

}
