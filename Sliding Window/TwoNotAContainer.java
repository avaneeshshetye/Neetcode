import java.util.Scanner;

public class TwoNotAContainer {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        int num; // No need to initialize num here
        
        do { // Loop continues until a positive number is entered
            System.out.print("Enter a positive number: ");
            num = scanner.nextInt();
            if (num <= 0) {
                System.out.println("Invalid input. Please enter a positive number.");
            }
        } while (num <= 0);
        
        System.out.println("You entered: " + num);
        scanner.close();
    }
    
    }
