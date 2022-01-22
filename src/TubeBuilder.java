
public abstract class TubeBuilder {
	
	public Tube buildTube() {
		Tube tube;
		tube = createTube();
		tube.fill();
		tube.seal();
		tube.describe();
		return tube;
	}
	
	protected abstract Tube createTube();

}
