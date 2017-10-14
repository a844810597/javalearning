public class CompoundInterest{
    public static void main(String args[]){
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;

		// set interest rates to 10...15%
		double[] interestRate = new double[NRATES];
		for(int j = 0; j < interestRate.length; j++)
			interestRate[j] = (STARTRATE + j) / 100;
		
		double[][] balances = new double[NYEARS][NRATES];

		// set initial balances to 1000
		for(int j = 0; j < balances[0].length; j++)
			balances[0][j] = 1000;
		
		// compute interest for future years
		for(int i = 1; i < balances.length; i++){
			for(int j = 0; j < balances[i].length; j++){
				// get last years's balances from previous row
				double oldBanlance = balances[i - 1][j];

				// compute interest
				double interest = oldBanlance * interestRate[j];

				// compute this year's balances
				balances[i][j] = oldBanlance + interest;
			}
		}

		// print one row of interest rates
		for(int j = 0; j < interestRate.length; j++)
			System.out.printf("%9.0f%%", 100 * interestRate[j]);
		
		System.out.println();

		// print balance table
		for(double[] row : balances){
			// print balance table
			for(double b : row)
				System.out.printf("%10.2f", b);
			
			System.out.println();
		}
	}
}