
public class BlackBody extends Body {
	
	private String color = "black";
	private Double size;
	
	public BlackBody(Double size) {
		this.size = size;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public Double getSize() {
		return this.size;
	}
	
}
