/*
 * 
(a) 試定義一個圓形類別CCircle，它繼承自CShape 類別，並改寫了父類別的area() method，可用來傳回圓形物件的面積。
(b) 試定義一個正方形類別CSquare，它也繼承自CShape 類別，同時改寫了父類別的area() method，可用來傳回正方形物件的面積。
(c) 試定義一個三角形類別CTriangle，它也繼承自CShape 類別，同時改寫了父類別的area() method，可用來傳回三角形物件的面積。
(d) 試利用 (a)~(c) 所定義的類別，建立圓形、正方形與三角形物件各兩個：
 */

import java.lang.Math;
import java.util.Scanner;
class CShape // 父類別CShape
{
	public static  int count = 0;
	public static  double lar = 0;
	public CShape() {
		count++;
	}
	public double area()
	{	
		return 0.0;
	}
	public static void largest(){
		System.out.println("最大面積 = " + lar);
	}
}
class CCircle extends CShape{
	private double radius; // 圓的半徑
	double pi = 3.14;

	public CCircle(double r) {
		this.radius = r;
		super.lar = Math.max(super.lar, this.area());
		System.out.println("面積" + super.count + " = " + this.area());
		
	}
	public double area()
	{
		return this.radius * this.radius * pi;
	}
}
class CSquare extends CShape{
	private double a;

	public CSquare(double a) {
		this.a = a;
		super.lar = Math.max(super.lar, this.area());
		System.out.println("面積" + super.count + " = " + this.area());
	}
	public double area()
	{
		return this.a * this.a;
	}
}

class CTriangle extends CShape{
	private double a;
	private double b;

	public CTriangle(double a, double b) {
		this.a = a;
		this.b = b;
		super.lar = Math.max(super.lar, this.area());
		System.out.println("面積" + super.count + " = " + this.area());
	}
	public double area()
	{
		return this.a * this.b * 0.5;
	}
}
public class A1 {

	public static void main(String[] args) {
		CShape shp[]=new CShape[6];
		shp[0]=new CCircle(2.0);
		shp[1]=new CCircle(3.0);
		shp[2]=new CSquare(4.0);
		shp[3]=new CSquare(5.0);
		shp[4]=new CTriangle(3.0,3.0);
		shp[5]=new CTriangle(5.0,4.0);
		CShape.largest();
	}

}
