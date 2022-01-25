public class WhiteBody extends Body {
	
	private String color = "white";
	private Double size;
	
	public WhiteBody(Double size) {
		this.size = size;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public Double getSize() {
		return this.size;
	}
	
}