package assignment_feb3week;
import java.util.Scanner;
public class frhe_to_java {
	public static void main(String[] args) {
//		Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		double fahrenheit, celsius;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Temperature fahrenheit: ");
		fahrenheit=sc.nextDouble();
		celsius = (fahrenheit-32)*5/9;
		System.out.print(fahrenheit+" F = "+celsius+" C");
	}
}
