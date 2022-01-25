public class GoldBody extends Body {
	
	private String color = "gold";
	private Double size;
	
	public GoldBody(Double size) {
		this.size = size;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public Double getSize() {
		return this.size;
	}
	
}