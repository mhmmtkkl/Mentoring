package Sema.TwoDArray;

public class Task1GridList {
    /*
           print out  below grid
           1   2   3   4
           5   6   7   8
           9   10  11  12
        */
    public static void main(String[] args) {
        int[][] grid={
                //  0 1 2 3
                {1,2,3,4},//0
                {5,6,7,8},//1
                {9,10,11,12},//2
        };
        for (int i = 0; i < grid.length; i++) { //rows //grid.length=3 this 2D arrays have 3 arrays
            for (int j = 0; j < grid[i].length; j++) { //columns grid[i].length=4
                System.out.print(grid[i][j]+"\t"); // 0,0 0,1 0,2 0,3
            }
            System.out.println();
        }

    }
}
