import java.util.*;
public class Vowels 
{
	public static Scanner keyboard = new Scanner(System.in);
	public static String[] words = new String[10];
	
	public static void input(String prompt, int count)
	{
		for(int i = 0; i < (count); i++)
		{
			System.out.print(prompt + " " + (i + 1) + " --> ");
			words[i] = keyboard.nextLine();
			System.out.print("\n");
		}
	}
	public static int getVowels(String in)
	{
		//search for a, e, i, o, u\
		int count = 0;
		for (int i = 0 ; i < in.length(); i++)
		{
		char ch = in.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u')
			{
				count ++;
			}
		}
		return count;
	}
	public static void printVowels(String prompt)
	{
		System.out.println(prompt + " - " + getVowels(prompt));
	}
	public static void printVowels(String[] prompt, int count)
	{
		System.out.print("Vowel Counts:\n============= \n");
		for(int i = 0; i < count; i++)
		{
			System.out.println(prompt[i] + " - " + getVowels(prompt[i]));
		}
	}
	public static void main(String[] args) 
	{
		input("Please enter word", 10);
		printVowels(words, words.length);
	}
}
