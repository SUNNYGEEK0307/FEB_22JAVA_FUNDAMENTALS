package assignment_mar1week;
import java.util.Scanner;
public class add_twonumbers_method {
	public static void add(int a, int b) {
		int ans = a + b;
		System.out.println(a+" + "+b+" = "+ans);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		add(a,b);
	}

}
