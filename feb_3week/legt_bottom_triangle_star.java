package assignment_feb3week;
import java.util.Scanner;
public class legt_bottom_triangle_star {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numbers of line: ");
		n=sc.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=i; j>1; j--) {
				System.out.print("* ");
			}
			System.out.println("* ");
		}
	}

}

