import java.text.*;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();//整數(以空白字元區隔)
		int m = scanner.nextInt();//整數(以空白字元區隔)
		
		
		int b = 0;
		for (int i = n; i <= m; i++) {
			b+=1;
			b*=2;
		}
		for (int i = 1; i < n; i++) {
			b*=2;
		}
		
		System.out.println(b); //輸出到小數點第2位
	}

}