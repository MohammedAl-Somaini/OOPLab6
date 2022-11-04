import java.util.Scanner;
public class Lab6Q8 {
        public static void main(String[] args) {
            int intNum;
            int counter=0;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter An Integer Number: ");
            intNum=in.nextInt();
            for (int i = 2; i <=intNum ; i++) {
                for (int j = 1; j <=i ; j++) {
                    if (i%j==0)
                        counter++;
                }
                if (counter==2)
                    System.out.println(i);
                counter=0;}
        }
}
