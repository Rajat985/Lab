package Basic;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		int num,originalNum,rem,fact,i,sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number :  ");
        num=in.nextInt();
        originalNum=num;
        while (num>0)
        {
            rem=num%10;
            
            fact=1;
            for(i=1;i<=rem;i++){
                fact*=i;
            }
            
            sum+=fact;
            num=num/10;
        }
        if (sum == originalNum) {
            System.out.println("The number: " + originalNum + " is strong number");
        } else {
            System.out.println("The number: " + originalNum + " is not a strong number");
        }

	}

}

