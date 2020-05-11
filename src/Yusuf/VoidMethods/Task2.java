package April15th;

public class Task2 {
    //Task 2
    //Write a method which will calculate the interest rate of your money
    // The formula is: the money * interest rate * months
    //money * (percentage / 100) * month
    public static void main(String[] args) {
        interest(1000,2,3);
    }
    public static void interest(int money, double percentage, int month){
        double result = money * (percentage / 100) * month;
        System.out.println(result + " is your interest. Your new money will be " + (result+money));
    }
}