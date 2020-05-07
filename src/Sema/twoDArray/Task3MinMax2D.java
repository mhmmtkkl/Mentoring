package Sema.twoDArray;

public class Task3MinMax2D {
    /*
        Create int 2D array

        Which is {{3,6,9,12},{2,4,6,8},{5,10,15,20}, {4,8,12,16}}

        print the max number from the 2d array
        print the min number from the 2d array
     */
    public static void main(String[] args) {
        int[][] numbers={{3,6,9,12},{2,4,6,8},{5,10,15,20}, {4,8,12,16}};
        int max=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]>max){
                    max=numbers[i][j];
                }
            }
        }
        System.out.println(max);

        int min=Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]<min){
                    min=numbers[i][j];
                }
            }
        }
        System.out.println(min);


    }
}
