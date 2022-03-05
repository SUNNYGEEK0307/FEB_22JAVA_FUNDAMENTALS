package assignment_mar1week;
import java.util.Scanner;
public class swap_method {
	public static void swap(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.print("After swaping : a = "+a+ " and b = "+b);
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a = ");
	int a = sc.nextInt();
	System.out.print("Enter b = ");
	int b = sc.nextInt();
	System.out.println("Before swaping : a = "+a+ " and b = "+b);
	swap(a,b);
	}

}
