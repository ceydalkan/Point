package Point;

public class Point {
	private int x_coor;
	private int y_coor;

	public Point(int x, int y) {
		this.x_coor = x;
		this.y_coor = y;
}
	
	public void setX(int x) {
		this.x_coor = x;
}

	public void setY(int y) {
		this.y_coor = y;
}

	public int getX() {
		return x_coor;
}

	public int getY() {
		return y_coor;
}

	public void displayPoint() {
		System.out.println("This point's coordinates are " + "(" + x_coor + "," + y_coor + ")");
}

	public int quadrant() {
		if(x_coor > 0 && y_coor > 0)
			return 1;
		else if(x_coor < 0 && y_coor > 0) 
			return 2;
		else if(x_coor < 0 && y_coor < 0)
			return 3;
		else 
			return 4;
}
}