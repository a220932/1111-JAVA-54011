import java.text.*;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next().toUpperCase();
		char c =scanner.next().toUpperCase().charAt(0);	
		int flag = -1;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == c){
				if(flag != -1){
					System.out.print(i-flag+" ");
				}
				flag = i;
			}
		}
	}
}