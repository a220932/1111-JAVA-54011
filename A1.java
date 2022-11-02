/*
 * 
(a) �թw�q�@�Ӷ�����OCCircle�A���~�Ӧ�CShape ���O�A�ç�g�F�����O��area() method�A�i�ΨӶǦ^��Ϊ��󪺭��n�C
(b) �թw�q�@�ӥ�������OCSquare�A���]�~�Ӧ�CShape ���O�A�P�ɧ�g�F�����O��area() method�A�i�ΨӶǦ^����Ϊ��󪺭��n�C
(c) �թw�q�@�ӤT�������OCTriangle�A���]�~�Ӧ�CShape ���O�A�P�ɧ�g�F�����O��area() method�A�i�ΨӶǦ^�T���Ϊ��󪺭��n�C
(d) �էQ�� (a)~(c) �ҩw�q�����O�A�إ߶�ΡB����λP�T���Ϊ���U��ӡG
 */

import java.lang.Math;
import java.util.Scanner;
class CShape // �����OCShape
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
		System.out.println("�̤j���n = " + lar);
	}
}
class CCircle extends CShape{
	private double radius; // �ꪺ�b�|
	double pi = 3.14;

	public CCircle(double r) {
		this.radius = r;
		super.lar = Math.max(super.lar, this.area());
		System.out.println("���n" + super.count + " = " + this.area());
		
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
		System.out.println("���n" + super.count + " = " + this.area());
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
		System.out.println("���n" + super.count + " = " + this.area());
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
