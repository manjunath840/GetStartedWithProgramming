package Programming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number the to check");
        int number = scanner.nextInt();

        if (number % 2 ==0){
            System.out.println("number is a even number");
        }else {
            System.out.println("number is  a Odd number");
        }
    }

}
