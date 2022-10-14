import java.text.*;
import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[][] a = new int[n][2];
		for(int i = 0; i<n; i++){
			a[i][0] = scanner.nextInt();
			a[i][1] = scanner.nextInt();
		}
		int b = scanner.nextInt();
		
		int bv = 0;
				
		while(b>0){
			
			int k = 0;
			for(int i = 1; i<n; i++){
				if(a[k][0]*a[i][1]>a[i][0]*a[k][1]){
					k = i;
				}
			}
			if(a[k][0]<=b){
				b-=a[k][0];
				bv += a[k][1];
				a[k][0] = 1;
				a[k][1] = 0;
			}
			else{
				bv+=(b*a[k][1])/a[k][0];
				b = 0;				
			}
		}
		
		
		
		
		System.out.println(bv); //輸出到小數點第2位
	}
	
}