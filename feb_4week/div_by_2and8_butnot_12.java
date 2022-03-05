package assignment_feb4week;
import java.util.Scanner;
public class div_by_2and8_butnot_12 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		n = sc.nextInt();
		if (n % 2 == 0 && n % 8 == 0 && n % 12 != 0) {
			System.out.print("True");
		} else {
			System.out.print("False");
		}
	}

}
