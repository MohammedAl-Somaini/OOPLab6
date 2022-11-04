import java.util.Scanner;
public class Lab6Q10 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter Today's price for one Dollar in Japanese yen: ");
            double yen = input.nextDouble();
            System.out.println("Please Enter the Dollar Amount: ");
            double dollar = input.nextDouble();
            double total = yen * dollar;
            System.out.println("The Total is " + total);
        }
    }

