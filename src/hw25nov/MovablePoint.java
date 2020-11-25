package hw25nov;

public class MovablePoint implements Movable {

	protected int x, y, xSpeed, ySpeed;
	
	

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	
	
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}



	@Override
	public void moveUp() {
		y -= ySpeed;
		System.out.println("Move Up");
		
	}

	@Override
	public void moveDown() {
		y += ySpeed;
		System.out.println("Move Down");
	}

	@Override
	public void moveLeft() {
		x -= xSpeed;
		System.out.println("Move Left");
	}

	@Override
	public void moveRight() {
		x += xSpeed;
		System.out.println("Move Right");
	}

}
