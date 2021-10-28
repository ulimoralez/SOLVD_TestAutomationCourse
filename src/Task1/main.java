package Task1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Input text and print it in the console
        Scanner sc = new Scanner(System.in);
        String inputText;
        System.out.println("Enter some text that you want to print in the console: ");
        inputText = sc.nextLine();
        System.out.println(inputText);

        //Print the first element in args
        System.out.println(args);
    }
}
