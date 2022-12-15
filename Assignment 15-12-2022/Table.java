package Basic;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int x,y,result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number:");
		x = sc.nextInt();
		for(y=1;y<=10;y++) {
			result=x*y;
			System.out.println(x + "X" + y + "=" + result);
		}
	}

}
