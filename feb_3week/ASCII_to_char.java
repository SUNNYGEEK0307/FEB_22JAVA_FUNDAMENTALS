package assignment_feb3week;
import java.util.Scanner;
public class ASCII_to_char {
	public static void main(String[] args) {
//		Write a program to add 3 to the ASCII value of the any character user provides and print the equivalent character.
		char c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Keyboard Character: ");
		c=sc.next().charAt(0);
		int ascii=c;
		System.out.print(ascii);
	}

}

