import java.text.*;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s1= scanner.next();//�r��(���t�ťզr��)
		String s2= scanner.next();//�r��(���t�ťզr��)
		
		
		int a = 0, b = 0;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)==s2.charAt(i))
				a++;
			else
				for(int j = 0; j < s2.length(); j++){
					if(s1.charAt(i)==s2.charAt(j))
						b++;
				}
		}
		
		
		System.out.println(a + " " +b); //��X��p���I��2��
	}

}