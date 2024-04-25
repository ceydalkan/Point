package Point;

public class TestPoint {
	public static void main(String[] args) {
		Point pointOne = new Point(3,2);
		Point pointTwo = new Point(5,4);
		
		System.out.println("midpoint:(" + (pointOne.getX() + pointTwo.getX())/2 + "," + (pointOne.getY() + pointTwo.getY())/2 + ")");
		pointOne.displayPoint();
	}
}
