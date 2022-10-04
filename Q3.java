
import java.text.*;
import java.util.Scanner;

public class Q3 {

  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    float x = Float.parseFloat(scanner.next());
    float y = Float.parseFloat(scanner.next());
    float z = Float.parseFloat(scanner.next());
    
    z/=1.6;
    z/=(x*60+y);
    z*=(60*60);
    
    DecimalFormat f1 = new DecimalFormat("0.0");//輸出到小數點第2位
    System.out.print("Speed = "+f1.format(z)); //輸出到小數點第2位

  }

}
