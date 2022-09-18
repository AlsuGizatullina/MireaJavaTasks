package HowMany;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String stroka = scanner.nextLine();
        var result = stroka.split(" ");
        System.out.print("Count of words: ");
        System.out.println(result.length);
    }
}