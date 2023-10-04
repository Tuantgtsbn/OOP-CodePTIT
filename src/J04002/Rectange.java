package J04002;

public class Rectange {
	private double width;
	private double height;
	private String color;
	public Rectange() {
		width=height=1;
	}
	public Rectange(double width,double height, String color) {
		this.width=width;
		this.height=height;
		this.color=color;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double findArea() {
		double s=this.getHeight()*this.getWidth();
		return s;
	}
	public double findPerimeter() {
		double c=(this.getHeight()+this.getWidth())*2;
		return c;
	}
	
}
