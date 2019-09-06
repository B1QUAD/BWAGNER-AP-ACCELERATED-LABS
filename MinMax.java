import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;

        System.out.print("Enter 1st Integer --> ");
        var1 = sc.nextInt();
        
		System.out.print("Enter 2nd Integer --> ");
        var2 = sc.nextInt();
        
		System.out.print("Enter 3rd Integer --> ");
        var3 = sc.nextInt();

        System.out.println("\nSmallest = " + Math.min(var1, (Math.min(var2, var3))));
        System.out.println("Largest = " + Math.max(var1, (Math.max(var2, var3))));
    }
}