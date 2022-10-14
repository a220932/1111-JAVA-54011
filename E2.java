import java.text.*;
import java.util.Scanner;

public class E2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nn = scanner.nextInt();
		
		while(nn!=0){
		int n = scanner.nextInt();
		int s=0;
		for(int i= 1;i<n;i++){
			if(n%i == 0)
				s+=i;
		}
		
		if(s > n)
			System.out.println(1); //輸出到小數點第2位
		if(s < n)
			System.out.println(2); //輸出到小數點第2位
		if(s == n)
			System.out.println(3); //輸出到小數點第2位
		nn--;
		}
	}
	
}