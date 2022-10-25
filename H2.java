/*
 * 
(a) �ճ]�p�@�ӫغc��CSphere(int a, int b, int c, double r)�A���غc���I�s�ɡA�K�|�۰ʳ]�wx=a�Ay=b�Az=c�Aradius=r�C
(b) �զbCSphere ���O�̥[�Jdistance() method�A�ΨӶǦ^2 �Ӳy���ߤ������Z���C2�I�����Z�������p�U�G
(c) �զbCSphere ���O�̥[�JisIntersect() method�A�ΨӧP�_2 �Ӳy��O�_�|�IĲ�C�]�N�O���A��2�Ӳy���ߪ��Z��<=2�y�b�|���M�ɡA��2�y�Y���IĲ�����ΡC
(d) ��J2 �Ӳy�骺��ߤΥb�|�A�إߤG�ӷs���y�骫��A��X2 �Ӳy���ߤ������Z���çP�_2 �Ӳy��O�_�|�IĲ�C

��J �G
7 4 5 2
6 2 8 3
 */

import java.lang.Math;
import java.util.Scanner;
class CSphere
{
  private int x; // ��ߪ�x �y��
  private int y; // ��ߪ�y �y��
  private int z; // ��ߪ�z �y��
  private double radius; // ��y���b�|
  
  public int getx(){
	  return x;
  }
  public int gety(){
	  return y;
  }
  public int getz(){
	  return z;
  }

  public double getr(){
	  return radius;
  }
  
  public CSphere(int a, int b, int c, double r){
	  x = a;
	  y = b;
	  z = c;
	  radius = r;
	  System.out.println("x=" + x + ", y=" + y + ", z=" + z + ", radius=" + radius);
  }
  
  public double distance(CSphere s){
	  double d = 0;
	  d += (this.x - s.getx()) * (this.x - s.getx());
	  d += (this.y - s.gety()) * (this.y - s.gety());
	  d += (this.z - s.getz()) * (this.z - s.getz());
	  d = Math.sqrt(d);
	  return d;
  }
  
  public void isIntersect(CSphere s){
	  if (this.distance(s) <= radius + s.getr())
		  System.out.println("2 �y���IĲ");
	  else
		  System.out.println("2 �y�S���IĲ");
  }
  
}
public class H2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double r = scanner.nextDouble();
		CSphere c1 = new CSphere(a, b, c, r);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		r = scanner.nextDouble();
		CSphere c2 = new CSphere(a, b, c, r);
		

		System.out.println("2 �y��ߪ��Z��  = " + c1.distance(c2));
		c1.isIntersect(c2);
		
	}

}
