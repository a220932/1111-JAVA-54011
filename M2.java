
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;
class EmployeeDefault // 父類別
{
	String empl_no; //人員編號
	double salary; //基本薪資
	
	public EmployeeDefault () {
	
	}
	public EmployeeDefault (String n, double s) {
		this. empl_no = n;
		this. salary = s;
	}
	public double getMonthMoney () {
		return salary;
	}
} 
class Employee extends EmployeeDefault
{
	double tech;// 技術加給
	double time;//加班總時數
	public int extra(){// 加班費
		int e = (int)(this.salary + this.tech)/240;
		return e;
	}
	
	public Employee (String n, double s, double t, double ti) {
		super(n, s);
		this.tech = t;
		this.time = ti;
	}
	public double getMonthMoney () {
		return salary + tech + time * extra();
	}
}
class Manager extends EmployeeDefault
{
	double proj;//專業加給
	double mana;//主管加給
	
	
	public Manager (String n, double s, double p, double m) {
		super(n, s);
		this.proj = p;
		this.mana = m;
	}
	public double getMonthMoney () {
		return salary + proj + mana;
	}
}

/*
 * 
 * in 4
E001 40000 8000 10
M101 50000 10000 10000
M211 55000 5000 10000
E013 48000 12000 50


out
72500
 */

public class M2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double max = 0;
	    double num = Double.parseDouble(scanner.next());
	    for (int i = 0; i < num; i++) {
	    	String n = scanner.next();
	    	double p1 = Double.parseDouble(scanner.next());
		    double p2 = Double.parseDouble(scanner.next());
		    double p3 = Double.parseDouble(scanner.next());
		    EmployeeDefault E = new EmployeeDefault();
		    if (n.charAt(0) == 'E')
		    	E = new Employee(n, p1, p2, p3);
		    else if (n.charAt(0) == 'M')
		    	E = new Manager(n, p1, p2, p3);
		    max = Math.max(max, E.getMonthMoney());
	    } 
		
		
		
	    DecimalFormat f1 = new DecimalFormat("0");//輸出到小數點第2位
		System.out.println(f1.format(max)); //輸出到小數點第2位

	}
}
