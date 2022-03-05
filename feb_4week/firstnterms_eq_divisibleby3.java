package assignment_feb4week;
import java.util.Scanner;
public class firstnterms_eq_divisibleby3 {
	public static void main(String[] args) {
		int n, term=0;
		Scanner sc=new Scanner(System.in);
	 	System.out.print("Enter number: ");
		n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			term=4*i+9;
			if(term%3==0) {
			System.out.println(i);
			}
		}
	}

}
