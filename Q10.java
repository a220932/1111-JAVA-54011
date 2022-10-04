import java.text.*;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0; i<n; i++){
			a[i][0] = scanner.nextInt();
			a[i][1] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		
		int val = bp(a, n, b, 0, 0, 0);
		
		
		
		System.out.println(val); //輸出到小數點第2位
	}
	private static int bp(int[][] a, int n, int b, int w, int v, int i) {
		if(b < w)return 0;
		if(i >= n)return v;
		int c1 = bp(a, n, b, w, v, i+1);
		int c2 = bp(a, n, b, w+a[i][0], v+a[i][1], i+1);
		if(c1>c2)return c1;
		else return c2;
	}
}