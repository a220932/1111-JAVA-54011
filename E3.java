import java.text.*;
import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x, y, z;
		
		while(1==1){
			x = scanner.nextInt();
			y = scanner.nextInt();
			z = scanner.nextInt();
			if(x<=0||z<=0)
				break;
			if(y<=1)
				break;
			
			
			
			
			int a = z/x, b = z%x, c = z/x;
			while (c/y>0) {
				int t = c/y;
				a+=t;
				c%=y;
				c+=t;
			}
			System.out.print(a+" ");
			System.out.print(b+" ");
			System.out.println(c);
			
		}
		
		
		
		
		
		
		
	}
	public static boolean ugly(int e) {
		if(e == 1)
			return true;
		if(e%2 == 0)
			return ugly(e/2);
		if(e%3 == 0)
			return ugly(e/3);
		if(e%5 == 0)
			return ugly(e/5);
		return false;
	}

}