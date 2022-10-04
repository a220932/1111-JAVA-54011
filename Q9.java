import java.text.*;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

import org.omg.IOP.TAG_INTERNET_IOP;

public class Q9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();//整數(以空白字元區隔)
		int[] a = new int[n];
		int count = 0;
		int k;
		for(int i = 0; i<n; i++){
			k = scanner.nextInt();
			if(prime(k) && palindrome(k)){
				insert(a, count, k);
				count++;
			}
		}

		for(int i = 0; i<count; i++){
			System.out.print(a[i]+" ");
		}
		
		
	}
	public static void insert(int[] b, int c, int k) {
		int i = 0;
		while(i < c){
			if(k < b[i]){
				break;
			}
			i++;
		}
		int t1 = k, t2;
		while(i<c){
			t2 = b[i];
			b[i] = t1;
			t1 = t2;
			i++;			
		}
		b[i] = t1;
	}
	public static boolean prime(int k) {
		for(int i = 2; 2*i<=k; i++){
			if(k%i == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean palindrome(int k) {
		if(k/10 == 0){
			return true;
		}
		
		int l = 1;
		for(int kk = k; kk/10 != 0; kk/=10){
			l*=10;
		}
	
		if(k/l == k%10){
			return palindrome((k%l)/10);	
		}
		else {
			return false;
		}
		
	}	
}