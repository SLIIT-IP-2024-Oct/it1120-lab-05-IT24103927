import java.util.Scanner;

public class IT24103927Lab5Q3.java {
   public staic void main(String[] args) {

        final double Room_CHARGE_PER_DAY = 48000.00;
        final int DISCOUNT_3_4_DAYS = 10; //10% discount
        final int DISCOUNT_5_OR_MORE = 20; // 20% discount
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the start day of the reservation (1-31): ");
        int startDay = scanner.nextInt();
        System.out.print("Enter the start day of the reservation (1-31): ");
        int endDay = scanner.nextInt();

        // Validate the input
        if (startDay < 1 || startDay > 31
        || endDay < 1 || endDay > 31) {
        System.out.println("Error: Start day and end day must be between 1 and 31.");

                  return;
        }

        if (startday >= endDay) {
            System.out.println("Error Start day must be less than the end day.")

                 return;
        }

        // Calculate the number of days reserved
        int daysReserved = endDay- startDay

        // Calculate the total amount
        double discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
        discountRate = DISCOUNT_3_4_DAYS;
        } else if (daysReserved >= 5) {DISCOUNT_5_OR_MORE;
        }

        double totalCharge = daysReserved
      * ROOM_CHARGE_PER_DAY;
        double discountAmount =
        totalCharge * discountRate / 100;
        double finalAmount = totalCharge- discountAmount;

        // Display thr results
        System.out.println("Number of days reserved:" + daysReserved);
        System.out.println("Total charge before discount: RS " + totalcharge);
        System.out.println("Discount applied: " + discountRate + "%" );
        System.out.println("Total amount to be paid: RS " + finalAmount);
        
       }
}