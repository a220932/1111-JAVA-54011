/*
 * 
 * 2.�г]�p�@CTriangle ���O�A�i�ΨӪ�ܤ@�ӤT���ΡC�����O���tbase�Bheight��color �T�Ӹ�Ʀ����A ���O�N��T���Ϊ����B���P�C��C
�Ш̷ӥH�U�n�D����Java�{���X�����g�G
(a) �w�qsetB()�BsetH()�PsetColor()�A�ϱo���̥i�H���O�Ψӳ]�wCTriangle ����base�Bheight �Pcolor �������ȡC
(b) �]�p�@�ӨS���޼ƪ��غc��CTriangle()�A�ϱo���غc���Q�I�s�ɡA�|�۰ʳ]�wbase=10�Aheight=5 �Acolor="blue" �C
(c) �]�p�@�ӫغc��CTriangle(int b, int h, String c)�A���غc���Q�I�s�ɡA�K�|�Q��(a)�ҩw�q��method�۰ʳ]�w�T���Ϊ����B���P�C��C
(d) �]�p�@��show() method�A�i�L�X�T���Ϊ� ���B���P�C��C
(e) ���O�Q��(b)��(c)���ͤG�ӷs������A�æL�X�T���Ϊ� ���B���P�C��C 
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


