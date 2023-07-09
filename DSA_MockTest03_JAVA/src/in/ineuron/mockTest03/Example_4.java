package in.ineuron.mockTest03;

/***
 * Create an interface called DRAWABLE with a method draw() that has no 
 * implementation. Implement this interface in classes Circle and Rectangle. 
 * Write a program that creates objects of Circle and Rectangle and calls 
 * the draw() method on each object.
 */

interface Drawable {
	void draw();
}

class Circle04 implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a circle");
	}
}

class Rectangle04 implements Drawable {
	@Override
	public void draw() {
		System.out.println("Drawing a rectangle");
	}
}

public class Example_4 {
	public static void main(String[] args) {
		Circle04 circle = new Circle04();
		Rectangle04 rectangle = new Rectangle04();

		circle.draw(); // Output: Drawing a circle
		rectangle.draw(); // Output: Drawing a rectangle
	}
}
