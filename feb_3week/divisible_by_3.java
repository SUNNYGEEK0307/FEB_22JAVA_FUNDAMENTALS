package assignment_feb3week;
import java.util.Scanner;
public class divisible_by_3 {
	public static void main(String[] Sunny) {
		int n, i=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lat number: ");
		n=sc.nextInt();
		while(i<n) {
			if(i%3==0 && i!=0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
