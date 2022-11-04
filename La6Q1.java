import java.util.Scanner;
public class La6Q1 {
    public static void main(String[] args) {
            double balance;
            double interestRate;
            double interest;
            int year=0;
            Scanner in= new Scanner(System.in);
            System.out.println("Enter Initial balance: ");
            balance=in.nextDouble();
            System.out.println("Enter  Rate of Interest: ");
            interestRate=in.nextDouble();
            interestRate/=100;
            while (balance<=1000000){
                interest=interestRate*balance;
                balance+=interest;
                year++;
            }
            System.out.println("Years= "+year);
        }
    }
