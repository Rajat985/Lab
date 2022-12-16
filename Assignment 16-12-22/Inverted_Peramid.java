package Basic;

import java.util.Scanner;

public class Inverted_peramid {

	public static void main(String[] args) {
		int num;
		Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        num=in.nextInt();
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}


	}

}
