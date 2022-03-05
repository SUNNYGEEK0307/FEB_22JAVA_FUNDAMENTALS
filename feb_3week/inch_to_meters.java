package assignment_feb3week;
import java.util.Scanner;
public class inch_to_meters {
	public static void main(String[] args) {
		double inch, meter= 0.0508;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value(in inches): ");
		inch=sc.nextDouble();
		meter=meter*inch;
		System.out.print(inch+" inches = "+meter+" m");
	}
}
