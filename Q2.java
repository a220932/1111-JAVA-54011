
import java.text.*;
import java.util.Scanner;

public class Q2 {

  public static void main(String[] args) {
  
    Scanner scanner = new Scanner(System.in);
    double money = Double.parseDouble(scanner.next());
    double rate = Double.parseDouble(scanner.next());
    
    double n = Double.parseDouble(scanner.next());
    double r = 1;
    for (int i = 0; i < n; i++) {
      r*=1+rate*0.01;
    }
    
    DecimalFormat f1 = new DecimalFormat("0.00");//��X��p���I��2��
    System.out.println(f1.format(money*r)); //��X��p���I��2��
  }

}