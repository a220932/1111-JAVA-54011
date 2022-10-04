import java.text.*;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();//整數(以空白字元區隔)
		
		int e = 1;
		while(n != 1){
			e++;
			if(ugly(e))
				n--;
		}
		
		System.out.println(e);
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