package entities;

public abstract class BbstractShape implements Shape{
	private Color color;

	public BbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
}
