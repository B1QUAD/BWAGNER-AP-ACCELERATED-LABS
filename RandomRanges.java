public class RandomRanges
{
	public static void main(String[] args) 
	{
		/*	
		Random Ranges
		================
		1. Range: 0 to 25 = 14
		2. Range: 1 to 3 = 1
		3. Range: 50 to 100 = 92
		4. Range: -1 to -10 = -5
		5. Range: -100 to 100 = -27
		6. Range: A to Z = V
		7. Range: 0.1 to 1 = 0.633
		8. Range: 1000 to 10000 = 3000
		*/
		
		System.out.println("1. Range: 0 to 25 = " + Math.round(Math.random() * 25));
		System.out.println("2. Range: 1 to 3 = " + Math.round((Math.random() * 2) + 1));
		System.out.println("3. Range: 50 to 100 = " + Math.round((Math.random() * 100) + 50));
		System.out.println("4. Range: -1 to -10 = " + Math.round((Math.random() * -1) -10));
		System.out.println("5. Range: -100 to 100 = " + Math.round((Math.random() * -100) + 100));
		System.out.println("6. Range: A to Z = " + ((char)((Math.random() * 26) + 65)));
		
		System.out.println("Programming Challenge: "); // Don't cheat on this part.
		double num7 = ((int)(Math.random() * 999));
		System.out.println(num7 / 1000);
		System.out.println(Math.round((int)(Math.random() * 10) + 1) * 1000);
	}
}
