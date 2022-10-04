import java.text.*;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();//整數(以空白字元區隔)
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++){
			a[i] = scanner.nextInt();//整數(以空白字元區隔)
		}
		
		int l = -1;
				
		for(int j = 0; j < n; j++){			
			int r = 1;
			for(int i = j; i < n; i++){
				r *= a[i];
				if(r > l)
					l = r;
			}
		}
		if(l < 0)
			l = 0;
		System.out.println(l); //輸出到小數點第2位
	}

}