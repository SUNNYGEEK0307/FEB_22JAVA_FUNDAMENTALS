package assignment_mar1week;
import java.util.Scanner;
public class last_indexelement_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int[] array = new int[size];

		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("At last index element is "+array[array.length-1]);
	}

}
