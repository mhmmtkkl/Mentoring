package Yusuf.WhileLoop;

public class Task3 {
    public static void main(String[] args) {
        //Task 3
        //Print all the even numbers from 1 to 78 using while loop
        int i = 1;

        while(i<=78){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }
    }
}
