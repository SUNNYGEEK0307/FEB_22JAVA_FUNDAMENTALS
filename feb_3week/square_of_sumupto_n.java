package assignment_feb3week;
import java.util.Scanner;
public class square_of_sumupto_n {
	/* WAP that prints square of sum up to 10 example output : 1^2+ 2^2 + 3^2 + 4^2
		+ 5^2 + ........... + 9^2 + 10^2*/
public static void main(String[] args) {
	int n, sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter last number: ");
	n = sc.nextInt();
	for (int i = 1; i <= n; i++) {
		sum = sum + i * i;
	}
	System.out.print(sum);
}

}

