import java.util.Scanner;
public class Lab6Q5 {
        public static void main(String[] args) {
            String text;
            char vowels []={'a','i','o','u','y','A','I','O','U','Y'};
            int vowels_num=0;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter a Text: ");
            text=in.next();
            for (int i = 0; i < text.length() ; i++) {
                for (int j = 0; j <10 ; j++) {
                    if (text.charAt(i)==vowels[j])
                        vowels_num++;
                }
            }
            System.out.println(" The Text That You Have Entered Has "+vowels_num+" Vowels Letters");
        }
    }
