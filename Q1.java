import java.util.Scanner;
import java.text.*;
public class Q1 {

  public static void main(String[] args) {
    Scanner scn =  new Scanner(System.in);
    float a = scn.nextFloat();
    float b = scn.nextFloat();
    float h = scn.nextFloat();
    
    
    DecimalFormat f1 = new DecimalFormat("0.00");//輸出到小數點第2位
    System.out.println(f1.format((a+b)*h*0.5)); //輸出到小數點第2位

  }

}