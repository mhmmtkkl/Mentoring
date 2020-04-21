package Tuba.Arrays2;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {


      //  sumOfPrime(4);
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public long sumOfPrime(int max) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; count < max; i++) {
            if (isPrime(i)) {
                list.add(i);
                count++;
            }
        }

        for (int each : list) {
            sum += each;
        }
       return sum;
    }

// 2,3,5,7 =17
}
