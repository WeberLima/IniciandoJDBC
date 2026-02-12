package entities;

public class Circle extends BbstractShape{
	private Double radius;
	
	
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}


	public Double getRadius() {
		return radius;
	}


	public void setRadius(Double radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}
