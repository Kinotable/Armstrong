import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> digits = new ArrayList<Integer>();
        System.out.println("Enter the number ");
        int num = s.nextInt();
        int x = String.valueOf(num).length();
        String string_number = Integer.toString(num);
        System.out.println("number of digits= " + x);
        // take the number of digits adn then make tht a list use tht list to later on add the the digits raised to the number of digits
        for (int i = 0; i < string_number.length(); i++) {
            if (Character.isDigit(string_number.charAt(i))) {
                int digit = Character.getNumericValue(string_number.charAt(i));
                System.out.println("Digit: " + digit);
                digits.add(digit);
                System.out.println(digits);
            }
        }
        int Sigma;
        for (int i = 0; i < digits.toArray().length;i++){
            System.out.println(digits.get(i));

        }

    }
}