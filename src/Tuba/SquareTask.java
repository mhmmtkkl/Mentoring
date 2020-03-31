package Tuba;

import java.util.Scanner;

public class SquareTask {
    public static void main(String[] args) {
        /*
        Take the values of length and width of a rectangle from the scanner
        check if it is a square or not
         */

        // if ur all sides are equal it is square if they are not equal it is rectangle

        Scanner scan=new Scanner(System.in);
        System.out.println("give me ur length");

        int length=scan.nextInt();

        System.out.println("give me ur width");
        int width=scan.nextInt();

        if(length==width){
            System.out.println("it is a square");
        }else{
            System.out.println("it is not a square");
        }
    }
}
