import java.util.*;

public class Averages
{
    // instance variables
    private int i = 0;
	private int holder = 0;
	private int posCount = 0;
    private int negCount = 0;
    private int posSum = 0;
    private int negSum = 0;

    /* This method generates a 100 random numbers and determines
     * if each number is positive or negative. If the number is
     * positive it increments posCount by one and increases posSum
     * by the value of the number. If the number is negative it
     * increments negCount by one and increases negSum by the
     * value of the number.
     */
    public void tallyAndSum()
    {
		while(i <= 100)
		{
			holder = generateNumber();
			System.out.println("number " + i + " " + generateNumber());
			i++;
			if(holder >= 0)
			{
				posCount++;
				posSum += holder;
			}
			else
			{
				negCount++;
				negSum += holder;
			}
		}
    }
	
    /* Calculates an average by dividing the sum by the count
     * @return the average
     * @param sum the sum that is to be averaged
     * @param count the count of the numbers to be averaged
     */
    public double average(int sum, int count)
    {
		System.out.println("Math sum/count=" + (sum / count));
		return (double)sum / count;
    }

    /* This method prints a summary report displaying the count,
     * sum, and average of the positive and negative numbers.
     */
    public void printSummary()
    {
		System.out.println("Print Summary");
		System.out.println("Positive count: " + posCount);
		System.out.println("Positive sum: " + posCount);
		System.out.println("Positive average: " + average(posSum, posCount));
		System.out.println("");
		System.out.println("Positive count: " + negCount);
		System.out.println("Positive sum: " + negCount);
		System.out.println("Positive average: " + average(negSum, negCount));
    }

    /* return a random number in the range -1000 to 1000
     */
    public int generateNumber()
    {
        return (int)(Math.random() * 2001) - 1000;
    }
	
    public static void main(String[] args)
    {
        Averages app = new Averages();
        app.tallyAndSum();
        app.printSummary();
    }
}
