import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Something: ");
        String userInput = sc.nextLine();

        System.out.printf("You Entered: \"%s\"%n", userInput);
        isNumeric(userInput);
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }

    public static void isNumeric(String s) {
        if (StringUtils.isNumeric(s))
            System.out.printf("\"%s\" is a number%n", s);
        else
            System.out.printf("\"%s\" is not a number%n", s);
    }
}
