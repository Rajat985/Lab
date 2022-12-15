package Basic;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Number: ");
		num = sc.nextInt();
		if(num%5==0 && num%11==0) {
			System.out.print("The number is divisible by both the number");
		}
		else if(num%5==0) {
			System.out.print("The number is divisible by 5");
		}
		else if(num%11==0) {
			System.out.print("The number is divisible by 11");
		}
		else {
			System.out.print("The number is not divisible by any of the number ");
		}

	}

}
