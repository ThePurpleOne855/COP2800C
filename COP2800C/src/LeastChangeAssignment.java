
public class LeastChangeAssignment {
	
	final int HALFDOLLAR = 50;
	final int QUARTER = 25;
	final int DIME = 10;
	final int NICKEL = 5;
	final int PENNY = 1;
	
	
	public static void main(String[] args) {
		int cycles = 0;
		
		LeastChangeAssignment changeTable = new LeastChangeAssignment();
		
		
		while(cycles < 5) {
			
			int halfDollarQuotient;
			int quaterQuotient;
			int dimeQuotient;
			int nickelQuotient;
			int pennyQuotient;
			
			int randomChange = (int)(Math.random() * 100);
			
			
			System.out.printf("Total Change = %d\n", randomChange);
			
			halfDollarQuotient = randomChange / changeTable.HALFDOLLAR;
			
			if(halfDollarQuotient > 1) {
				System.out.printf("Half Dollars..... %d\n", halfDollarQuotient);
			} else {
				System.out.printf("Half Dollar..... %d\n", halfDollarQuotient);
			}
			randomChange = randomChange - (halfDollarQuotient * changeTable.HALFDOLLAR);
			
			quaterQuotient = randomChange / changeTable.QUARTER;
			
			if(quaterQuotient > 1) {
				System.out.printf("Quarters...... %d\n", quaterQuotient);
			} else {
				System.out.printf("Quarter..... %d\n", quaterQuotient);
			}
			
			randomChange = randomChange - (quaterQuotient * changeTable.QUARTER);
			
			dimeQuotient = randomChange / changeTable.DIME;
			
			if(dimeQuotient > 1) {
				System.out.printf("Dimes..... %d\n", dimeQuotient);
			} else {
				System.out.printf("Dime..... %d\n", dimeQuotient);
			}
			
			randomChange = randomChange - (dimeQuotient * changeTable.DIME);
			
			nickelQuotient = randomChange / changeTable.NICKEL;
			
			if(nickelQuotient > 1) {
				System.out.printf("Nickels..... %d\n", nickelQuotient);
			} else {
				System.out.printf("Nickel..... %d\n", nickelQuotient);
			}
			
			randomChange = randomChange - (nickelQuotient * changeTable.NICKEL);
			
			pennyQuotient = randomChange / changeTable.PENNY;
			
			if(pennyQuotient > 1) {
				System.out.printf("Pennies..... %d\n", pennyQuotient);
			} else {
				System.out.printf("Penny..... %d\n", pennyQuotient);
			}
			
			System.out.printf("\n\n\n\n");
			
			cycles += 1;
		}
		
		
	}
}
