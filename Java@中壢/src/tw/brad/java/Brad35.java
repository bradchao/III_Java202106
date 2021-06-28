package tw.brad.java;

public class Brad35 {

	public static void main(String[] args) {
		Circle c1 = new Circle(3);
		Triangle t1 = new Triangle(1, 1, 1, 3);
		System.out.println(sumArea(t1, t1));
	}
	
	static double sumArea(Shape s1, Shape s2) {
		return s1.getArea() + s2.getArea();
	}
}

// interface 定義介面 => 定義規格
interface Shape {
	double getLength();
	double getArea();
}
// 多型
class Circle implements Shape {
	double r;
	Circle(double r){
		this.r = r;
	}
	public double getLength() {
		return 2*Math.PI*r;
	}
	public double getArea() {
		return Math.PI*Math.pow(r, 2);
	}
}
class Triangle implements Shape {
	double len1, len2, len3, h;
	Triangle(double len1, double len2, double len3, double h){
		this.len1 = len1;
		this.len2 = len2;
		this.len3 = len3;
		this.h = h;
	}
	public double getLength() {
		return len1+len2+len3;
	}
	public double getArea() {
		return len1*h/2;
	}
	
}
