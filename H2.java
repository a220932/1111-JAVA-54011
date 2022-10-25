/*
 * 
(a) 試設計一個建構元CSphere(int a, int b, int c, double r)，當此建構元呼叫時，便會自動設定x=a，y=b，z=c，radius=r。
(b) 試在CSphere 類別裡加入distance() method，用來傳回2 個球體圓心之間的距離。2點間的距離公式如下：
(c) 試在CSphere 類別裡加入isIntersect() method，用來判斷2 個球體是否會碰觸。也就是說，當2個球體圓心的距離<=2球半徑之和時，此2球即有碰觸的情形。
(d) 輸入2 個球體的圓心及半徑，建立二個新的球體物件，輸出2 個球體圓心之間的距離並判斷2 個球體是否會碰觸。

輸入 ：
7 4 5 2
6 2 8 3
 */

import java.lang.Math;
import java.util.Scanner;
class CSphere
{
  private int x; // 圓心的x 座標
  private int y; // 圓心的y 座標
  private int z; // 圓心的z 座標
  private double radius; // 圓球的半徑
  
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
		  System.out.println("2 球有碰觸");
	  else
		  System.out.println("2 球沒有碰觸");
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
		

		System.out.println("2 球圓心的距離  = " + c1.distance(c2));
		c1.isIntersect(c2);
		
	}

}
