import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Give a mathematical query using 2 numbers and an arithmetic sign: +,-,/,*,^,%");
            double result = 0;
            String query = sc.nextLine();
            if (query.contains("+")) {
                String[] factors = query.split(Pattern.quote("+"));
                double factor1 = Double.parseDouble(factors[0]);
                double factor2 = Double.parseDouble(factors[1]);
                result = factor1 + factor2;
            } else if (query.contains("-")) {
                String[] factors = query.split(Pattern.quote("-"));
                double factor1 = Double.parseDouble(factors[0]);
                double factor2 = Double.parseDouble(factors[1]);
                result = factor1 - factor2;
            } else if (query.contains("/")) {
                String[] factors = query.split(Pattern.quote("/"));
                double factor1 = Double.parseDouble(factors[0]);
                double factor2 = Double.parseDouble(factors[1]);
                result = factor1 / factor2;
            } else if (query.contains("*")) {
                String[] factors = query.split(Pattern.quote("*"));
                double factor1 = Double.parseDouble(factors[0]);
                double factor2 = Double.parseDouble(factors[1]);
                result = factor1 * factor2;
            } else if (query.contains("^")) {
                String[] factors = query.split(Pattern.quote("^"));
                double factor1 = Double.parseDouble(factors[0]);
                double factor2 = Double.parseDouble(factors[1]);
                result = Math.pow(factor1, factor2);
            } else if (query.contains("%")) {
                String[] factors = query.split(Pattern.quote("%"));
                double factor1 = Double.parseDouble(factors[0]);
                double factor2 = Double.parseDouble(factors[1]);
                result = factor1 % factor2;
            } else System.out.println("Wrong input bro. Try again...");
            System.out.printf("The result of the query: %f \n\n", result);
        }
    }
}