package assignment_feb3week;
import java.util.Scanner;
public class while_10to1 {
	public static void main(String[] args) {
//		 Write a program to print 10 to 1 using while loop
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter last number: ");
		n=sc.nextInt();
		while(n>0) {
			System.out.println(n);
			n--;
		}
	}

}
