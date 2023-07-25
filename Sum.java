import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        double x = sc.nextDouble();
        
        System.out.print("Input second number: ");
        double y = sc.nextDouble();
        
        System.out.print("Input third number: ");
        double z = sc.nextDouble();
        
        double largest = x;
        if (y > largest) {
            largest = y;
        }
        if (z > largest) {
            largest = z;
        }
        
        double sum = largest;
        System.out.println("The largest number is " + largest);
        System.out.println("The sum of the largest number is " + sum);

        double average = (x + y + z) / 3;
        System.out.println("The average of the three numbers is " + average);
    }
} 