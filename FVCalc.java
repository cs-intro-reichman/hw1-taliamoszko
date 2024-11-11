// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int balance = Integer.parseInt(args[0]);
		double interest = ((double) Integer.parseInt(args[1])) /100.0;
		int n = Integer.parseInt(args[2]);
		
		double futureValue = balance * Math.pow(1 + interest, n);
		
		System.out.println("After " + n + " years, $" + balance + " saved at " + (interest * 100) + "% will yield $" + (int) futureValue);
    }


	}
