package Tuba.Arrays2;

public class PrimeNumber {
    public static void main(String[] args) {
        /*
          Find the prime numbers between 1 and 50
          What is the prime number?

          the number is greater than 1, divisible by only 1 and itself . They have 2 divisors

          Example: 7,11,13,43,47

          8 // 1,2,4,8

          What is the smallest prime number?

          2 is the smallest prime number
         */

        int myNumber=0;

        for(myNumber=1; myNumber<=50 ;myNumber++){
            int count=0;
            for(int factors=1; factors<=myNumber/2; factors++){
                if(myNumber%factors==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(myNumber+ " is a prime number");
            }

        }
    }
}
