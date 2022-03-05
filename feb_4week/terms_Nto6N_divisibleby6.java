package assignment_feb4week;
import java.util.Scanner;
public class terms_Nto6N_divisibleby6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter terms");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int term = i*6*i;
			if(term%6==0) {
			System.out.println(i);
			}
		}
	}

}
