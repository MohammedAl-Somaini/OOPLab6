import java.util.Scanner;
public class Lab6Q7 {
        public static void main(String[] args) {
            int num;
            int binary_array[] = new int[32];
            int counter=0;
            Scanner in=new Scanner(System.in);
            System.out.print("Enter a Number: ");
            num=in.nextInt();
            System.out.print("The Number in Binary Is: ");
            while (num>0){
                binary_array[counter]=num%2;
                num/=2;
                counter++;
            }
            for (int i = counter-1; i >=0 ; i--) {
                System.out.print(binary_array[i]);}}}
