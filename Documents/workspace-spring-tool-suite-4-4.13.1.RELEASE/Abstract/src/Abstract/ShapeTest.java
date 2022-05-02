package Abstract;
abstract class Shape{
	public abstract void draw();
}
class Line extends Shape{
	public void draw() {
		System.out.println("Draw Line");
	}
}
class Rectangle extends Shape{
	public void draw() {
		System.out.println("Draw Rectangle");
	}
}
class Cube extends Shape{
	public void draw() {
		System.out.println("Draw Cube");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
Shape shape[] = new Shape[3];
shape[0] = new Line();
shape[1] = new Rectangle();
shape[2] = new Cube();
for(int i=0;i<shape.length;i++)
	shape[i].draw();
	}
}
