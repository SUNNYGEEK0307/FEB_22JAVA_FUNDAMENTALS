package assignment_feb3week;
import java.util.Scanner;
public class pyramid_star_pattern {
	public static void main(String[] args) {
		int n, k=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numbers of line: ");
		n=sc.nextInt();
		for (int i=1; i<=n; ++i, k=0) {
		      for (int space=1; space<=n-i; ++space) {
		        System.out.print("  ");
		      }

		      while (k!=2*i-1) {
		        System.out.print("* ");
		        ++k;
		      }

		      System.out.println();
		}
	}

}
