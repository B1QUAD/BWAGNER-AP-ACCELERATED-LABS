public class Baseball
{
	public static void main(String[] args) 
	{
		/*
			Create 4 variables named hits, atBats, battingAvg, and roundedAvg. 
			The variables hits, atBats, and roundedAvg are of type int and battingAvg is of type double. 
			Initialize hits to 27, atBats to 80, battingAvg to zero, and roundedAvg to zero.
			Calculate his batting average using the following formula:

			battingAvg equals hits divided by atBats

			*Since both hits and atBats are integers you will need to cast one of them to a double before doing the division.
			To round to the nearest thousandth use the following formula:

			battingAvg equals (battingAvg + 0.0005)       *option: you can also use += operator

			To convert the rounded average to an integer do the following:
			- multiply battingAvg by 1000 and store the answer back into battingAvg
			- cast battingAvg to an int and store the result in roundedAvg
			The program's output should be in the same format as the Sample Run below.
			Hits = 27
			At Bats = 80
			-------------------------
			Batting Average = 338 
		*/
		int hits = 27, atbats = 80, roundedAvg =0;
		double battingAvg = 0;
		
		System.out.println("Hits = " + hits);
		
		System.out.println("At Bats = " + atbats);
		
		battingAvg = (double)hits/atbats; //calculates value of batting average
		
		battingAvg += 0.0005; //Rounds battingAvg 
		
		battingAvg *=1000; //Sets Batting Average equal to itelf times 1000 in order to make it have a value greater than one
		
		roundedAvg = (int)battingAvg; //sets the variable for the rounded average equal to the batting average using a cast thereby removing the decimal
		
		System.out.println("-------------------------\n" + "Batting Average = " +  roundedAvg); //Prints the rouded average
		
		
	}
}