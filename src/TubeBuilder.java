
/**
 * An abstract class that forces subclasses to implement the createTube method, allowing each to implement a unique method and return a unique tube.
 * @author tatenknight
 *
 */
public abstract class TubeBuilder {
	
	public Tube buildTube(String colors) {
		Tube tube;
		tube = createTube(colors);
		tube.fill();
		tube.seal();
		tube.describe();
		return tube;
	}
	
	protected abstract Tube createTube(String colors);

}
