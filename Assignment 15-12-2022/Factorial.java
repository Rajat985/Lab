package Basic;

public class Factorial {

	public static void main(String[] args) {
		int count;
	      long factorial = 1;
	      
	      // Find factorial from 1 to 10
	      System.out.printf("%4s%30s\n", "Number", "Factorials");
	      for(count = 1; count <= 10; count++)
	      {
	         factorial *= count;
	         System.out.printf("%4d%,30d\n", count, factorial);
	      }

	}

}
