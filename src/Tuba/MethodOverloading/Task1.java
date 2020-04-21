package Tuba.MethodOverloading;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /**
     * TASK 1
     * Write a method named getTotal
     * that accepts number as string argument
     * and return sum of digits in provided number,
     * but there is a catch
     * if digit is even you digit is multiplied by 2
     * if digit is odd you digit is multiplied by -1
     * Note: if sum is zero then return -1
     * <p>
     * ex1: you passed argument "85" and return is 11
     * because: (8 * 2) + (5 * -1) = 11
     * <p>
     * ex2: "0" ->  -1
     * because://
     */
    //write you code here
    public static int getTotal(String number) {
       int sum = 0;
        for (int i = 0; i < number.length(); i++) {
           int digit = Integer.parseInt(number.substring(i, i + 1));
            if (digit % 2 == 0) {
                sum += digit * 2;
            } else {
                sum += digit * -1;
            }
        }
        return sum == 0 ? -1 : sum;


    }
    //end

    /**
     * TASK 2
     * Write a method named bankStatementCalculator
     * that accepts bankStatements as List<String> argument
     * and return total of bank statements
     * Note: if total is zero then return -1
     * <p>
     * ex: arguments is like: {$15.00, $10.20, $2,050,75} and return is 2075.95
     * <p>
     * Hint: remove the unnecessary icons and calculate the total
     */
    //write you code here
    public static double bankStatementCalculator(ArrayList<String> bankStatements) {
        double sum = 0;
        for (String str : bankStatements) {
            String replace = str.replace("$", "");
            String replace2 = replace.replace(",", "");
            double num = Double.parseDouble(replace2);
            sum += num;
        }
        if (sum == 0) {
            return -1;
        } else
            return sum;
    }

    public static void main(String[] args) {
        System.out.println(getTotal("123"));

        ArrayList<String> bankStatements1=new ArrayList<>();
        bankStatements1.add("$24");
        bankStatements1.add("$2,050,75");

        System.out.println(bankStatementCalculator(bankStatements1));


    }
}
