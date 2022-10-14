import java.text.*;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		
		
		
		System.out.println(com(s)); //輸出到小數點第2位
	}
	private static String com(String s) {
		if(s.length()<3)return s;
		
		char c = s.charAt(0);
		//s = s.substring(1);
		int count = 1;
		for(int i = 1; i<s.length(); i++){
			if(s.charAt(i) == c)
				count++;
			else{
				String nc = ""+count+c;
				if(count == 1)
					nc = ""+c;
				if(count == 2)
					nc = c+""+c;
				return "" + nc +com(s.substring(i));
			}
		}
		String nc = ""+count+c;
		if(count == 1)
			nc = ""+c;
		if(count == 2)
			nc = "2"+c;
		return "" + nc ;
	}
}