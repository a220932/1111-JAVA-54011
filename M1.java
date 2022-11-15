import java.util.Scanner;

public class M1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
    	String s = scanner.nextLine();
    	String ss = "";
    	int count;
    	char c;
	    for (int i = 0; i < s.length();) {
	    	count = 0;
	    	c = s.charAt(i);
	    	while (i < s.length() && s.charAt(i) == c){
	    		count++;
	    		i++;
	    	}
	    		
	    	ss += "" + count + c;
	    } 
	    //ss += "" + count + c;
		System.out.println(ss);

	}
}
