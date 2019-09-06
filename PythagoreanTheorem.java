import java.util.Scanner;
public class PythagoreanTheorem
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double side1 = 0;
		double side2 = 0;
		double hypotnuse = 0;
		
		System.out.println("Please enter side one --> ");
		side1 = sc.nextInt();
		System.out.println("Please enter side one --> ");
		side2 = sc.nextInt();
		
		side1 = Math.pow(2.0, side1);
		side2 = Math.pow(2.0, side2);
		hypotnuse = Math.sqrt(side1 * side2);
		
		System.out.println("The hypotnuse of the triangle = " + Math.round((int)hypotnuse));
	}
}