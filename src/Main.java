import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static String formatScientific(BigInteger number) {
        BigDecimal numberDecimal = new BigDecimal(number);
        DecimalFormat decimalFormat = new DecimalFormat("0.00E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
        return decimalFormat.format(numberDecimal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int userInput = scanner.nextInt();

        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        BigInteger third;

        int counter = 1;

        while (counter <= userInput) {
            System.out.println(counter);

            third = first.add(second);
            first = second;
            second = third;

            counter++;
        }

        System.out.printf("%n%dth fibonacci number: %s%n", userInput, formatScientific(first));
    }
}