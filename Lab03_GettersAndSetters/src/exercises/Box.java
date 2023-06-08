package exercises;

public class Box {
	private int width;
	private int depth;
	private int height;
	
	// Constructor for the Box class
	Box(int width, int depth, int height) {
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	
	//Getters
	public int getWidth() {
		return this.width;
	}
	
	public int getDepth() {
		return this.depth;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	// Setters
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	// String representing the object now outputs WxDxH
	public String toString() {
		return (this.width+"x"+this.depth+"x"+this.height);
	}
	
	// Check if the input box can fit in box instance
	public boolean fits(Box box) {
		return (box.width < this.width && box.depth < this.depth && box.height < this.height);
	}
	
	// Check if three boxes can fit inside each other
	public boolean fits(Box box1, Box box2) {
		return (this.fits(box1) && box1.fits(box2));
	}
}
