import java.util.Scanner;

public class Rectangle
{
	public static void main(String[] args) 
	{
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Enter the Length --> ");
		int length = Keyboard.nextInt();
		System.out.println("Enter the Width --> ");
		int width = Keyboard.nextInt();
		
		System.out.println("Perimeter = " + ((length * 2) +  (width *2)));
		System.out.println("Area = " + (length * width));
	}
}