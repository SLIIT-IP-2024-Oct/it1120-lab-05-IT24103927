import java.util.Scanner;

public class IT24103927Lab5Q1.java 
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

               // Input three integers
               System.out.print("Enter the first number: ");
               int num1 = scanner.nextInt();
 
               
                System.out.print("Enter the second number: ");
               int num2 = scanner.nextInt();

               
                System.out.print("Enter the third number: ");
               int num3 = scanner.nextInt();


               // Find the smallest number
               int smallest = Math.min(num1,Math.min(num2,num3));

         
               // Find the largest number
               int largest = Math.max(num1,Math.max(num2,num3));

              
              // Output results
              System.out.println("The smallest number is: " + smallest);
              System.out.println("The largest number is: " + largest);

              
              Scanner.close();
        }
}
              
   
 