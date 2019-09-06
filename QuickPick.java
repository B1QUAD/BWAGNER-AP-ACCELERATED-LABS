public class QuickPick
{
	public static void main(String[] args) 
	{
		System.out.println("Texas Lottery Quick Pick \n" + "========================");
		System.out.print((int)((Math.random() * 50) + 1) + " ");
		System.out.print((int)((Math.random() * 50) + 1) + " ");
		System.out.print((int)((Math.random() * 50) + 1) + " ");
		System.out.print((int)((Math.random() * 50) + 1) + " ");
		System.out.print(((int)(Math.random() * 50) + 1) + " ");
		System.out.print(((int)(Math.random() * 50) + 1) + " ");
		System.out.println("");
	}
}