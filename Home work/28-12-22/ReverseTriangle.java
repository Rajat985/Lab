package Basic;

public class ReverseTriangle {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--)//outer loop
		{
			for(int j=5;j>=1;j--)//inner loop
			{
				if(j<=i)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}

