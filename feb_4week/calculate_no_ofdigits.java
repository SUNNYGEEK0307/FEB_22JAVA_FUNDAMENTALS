package assignment_feb4week;
import java.util.Scanner;
public class calculate_no_ofdigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int count=1;
		while(n>0) {
			int r = n%10;
			n = n/10;
			count++;
		}
		System.out.print(count-1);
	}

}
