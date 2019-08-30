public class Grades
{
	public static void main(String[] args) 
	{
		/*Create 4 variables of type double named dailyAvg, quizAvg, testAvg, and sixWeeksAvg. Initialize dailyAvg to 88, quizAvg to 74, testAvg to 95, and sixWeeksAvg to zero.
		Create another variable of type int named roundedAvg and initialize it to zero.
		Calculate the six weeks average using the following formula: 

		sixWeeksAvg equals dailyAvg times 0.3 plus quizAvg times 0.2 plus testAvg times 0.5
		To round the six week's average to the nearest integer do the following:
		- add 0.5 to sixWeeksAvg
		- cast the sixWeeksAvg to an int and store the result in roundedAvg
		The program's output should be in the same format as the Sample Run below.
		Daily Average = 88.0	
		Quiz Average = 74.0
		Test Average = 95.0
		--------------------------
		Six Weeks Average = 88.7
		Rounded Average = 89
		*/
		
		double dailyAvg = 88;
		double quizAvg = 74;
		double testAvg = 95;
		double sixWeeksAvg = 0;
		int roundedAvg = 0;
		
		sixWeeksAvg = (dailyAvg * 0.3) + (quizAvg * 0.2) + (testAvg *0.5);
		
		
		System.out.println("Daily Average = " + dailyAvg);
		System.out.println("Quiz Average = " + quizAvg);
		System.out.println("Test Average = " + testAvg);
		System.out.println("--------------------------");
		System.out.println("Six Weeks Average = " + sixWeeksAvg);
		sixWeeksAvg += 0.5;
		roundedAvg = (int)sixWeeksAvg;
		System.out.println("Rounded Average = " + roundedAvg);
		
	}
}