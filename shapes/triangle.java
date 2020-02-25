package shapes;

public class triangle extends shape{

	private int base;             
	private int height;

	public triangle(String colour, int base, int hight) {
		super(colour);
		this.base = base;
		this.height = hight;
	}

	public int getBase() {
		return this.base;
	}

	public int getHeight() {
		return this.height;
	}

	public int getArea() {          
			return 1;
		}
}