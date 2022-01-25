public class BlueBody extends Body {
	
	private String color = "blue";
	private Double size;
	
	public BlueBody(Double size) {
		this.size = size;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public Double getSize() {
		return this.size;
	}
	
}