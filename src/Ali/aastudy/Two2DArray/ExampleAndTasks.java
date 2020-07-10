package Ali.aastudy.Two2DArray;

public class ExampleAndTasks {

    public static void main(String[] args) {

        /*
        Do  together - Example

            Create String 2d array

            Enter the values

            print total length of the strings

            for example  {I , use , toyota } , {I , use , honda}

            result should be 19



        int total = 0;

        String[][] strArr = {{"I" , "use" , "toyota"} , {"I" , "use" , "honda"}};

        for(int i = 0 ; i < strArr.length ; i++) {
            for (int j = 0; j < strArr[i].length; j++) {

                total += strArr[i][j].length();

            }
        }

        System.out.println(total);

    */


        /*

        Task1

            create int 2d array

            sum all the numbers

            and print it


        int[][] num2dArr = {{1, 2}, {1, 2, 3}, {10, 11, 12}};

        int total = 0;
        for (int i = 0; i < num2dArr.length; i++) {

            for (int j = 0; j < num2dArr[i].length; j++) {

                total += num2dArr[i][j];

            }

        }

        System.out.println(total);

         */


        /*
    Task2
        Create String 2d array name is fruit if the array contains orange print true if it is not print false

        For example
        {{"Apple , "Kiwi , "PineApple"} {"Banana" , "Peach" , "Orange"}}

        Result should be true

        {{"Apple , "Kiwi , "PineApple"} {"Banana" , "Peach" , "Watermelon"}}

        Result should be false



        String[][] fruit = {{"Apple" , "Kiwi" , "PineApple"} ,{"Banana" , "Peach" , "Watermelon"}};


        boolean b1 = false;

        for (int i = 0; i < fruit.length; i++) {

            for (int j = 0; j < fruit[i].length; j++) {

                if(fruit[i][j].equals("Orange")){

                    b1 = true;

                }

            }

        }
        System.out.println(b1);

        */


        /*
            Task 3

            Create int 2d array find a max number in the array

            {1,2,1} , {5,3,4,1} ,{2,1,3,1}
            print 5

        int[][] arr = {{1,2,1} , {5,3,4,1} ,{2,1,3,1}};

        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] > max){

                    max = arr[i][j];

                }

            }

        }

        System.out.println(max);

         */


        /*
        Task 4

        Create String 2d array
        if the string contains $ sign multiply by 5.6
        if the string contains € sign multiply by 6.6

        print the total


        String[][] nums = {{"€12" , "€2" , "€11", "$2"} ,{"€12" , "€1" , "$12" } , {"$1"}};

        int total = 0 ;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums[i].length; j++) {

                if(nums[i][j].contains("$")){

                   String strNum =  nums[i][j];

                   strNum = strNum.replace("$" , "");

                   int intNum = Integer.parseInt(strNum);

                   double doubleNum = intNum*5.6;

                   total += doubleNum;

                }else  if(nums[i][j].contains("€")){
                    String strNum =  nums[i][j];

                    strNum = strNum.replace("€" , "");

                    int intNum = Integer.parseInt(strNum);

                    double doubleNum = intNum*6.6;

                    total += doubleNum;

                }

            }

        }

        System.out.println(total);
         */

    }
}