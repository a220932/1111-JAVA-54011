/*
 * 
 * 2.請設計一CTriangle 類別，可用來表示一個三角形。此類別內含base、height及color 三個資料成員， 分別代表三角形的底、高與顏色。
請依照以下要求完成Java程式碼的撰寫：
(a) 定義setB()、setH()與setColor()，使得它們可以分別用來設定CTriangle 物件的base、height 與color 成員的值。
(b) 設計一個沒有引數的建構元CTriangle()，使得當此建構元被呼叫時，會自動設定base=10，height=5 ，color="blue" 。
(c) 設計一個建構元CTriangle(int b, int h, String c)，當此建構元被呼叫時，便會利用(a)所定義的method自動設定三角形的底、高與顏色。
(d) 設計一個show() method，可印出三角形的 底、高與顏色。
(e) 分別利用(b)及(c)產生二個新的物件，並印出三角形的 底、高與顏色。 
 * 
 * 
 * 
 * */

class CTriangle {
	private int base;
	private int hight;
	private String color;
	
	private void setB(int b){
		this.base = b;
	}
	private void setH(int h){
		this.hight = h;
	}
	private void setColor(String c){
		this.color = c;
	}
	
	public CTriangle(){
		setB(10);
		setH(5);
		setColor("blue");
	}
	public CTriangle(int b, int h, String c){
		setB(b);
		setH(h);
		setColor(c);
	}
	
	public void show(){
		System.out.println("Color=" + color);
		System.out.println("base=" + base + ", hight=" + hight);
	}
}

public class H1 {

	public static void main(String[] args) {
		CTriangle t1, t2;
		t1 = new CTriangle();
		t1.show();
		
		t2 = new CTriangle(30, 10, "red");
		t2.show();
	}

}


