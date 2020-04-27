package Ali.officeHour.Week4;

public class Example2 {

    public static void main(String[] args) {

        int[][] numberArray = {{10,10,10} ,{5,5,5,5,5}, {10}, {5,5,5,5}};

        int total = 0;

        for(int i = 0 ; i<numberArray.length ; i++){

            for(int j = 0 ; j <numberArray[i].length ;j++){

                total+= numberArray[i][j];

            }

        }

        System.out.println(total);

    }

}
