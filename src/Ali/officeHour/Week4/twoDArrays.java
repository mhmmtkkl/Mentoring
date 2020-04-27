package Ali.officeHour.Week4;

public class twoDArrays {

        public static void main(String[] args) {

            int[] myArr = new int[3];// 1D array

            int[][] my2DArr = new int[2][3];

            int[][] myNums = {{1,2,3,4} , {5,6} , {7}};

//          Object[][] myNum = {{"aaa" , 12} ,{ 1.2}};  // you can put string and int in the same time

            // how to print all the variables in the 2d array

            System.out.println("mynums . length "+myNums.length);

             for(int i = 0 ; i < myNums.length ; i++){
                 System.out.println("myNums i .length --->>>    "+myNums[i].length);

                 for(int j = 0 ; j< myNums[i].length ; j++ ){

                    System.out.println(myNums[i][j]);
                }

             }




//            System.out.println("my num length -->> "+myNums.length);
//
//            System.out.println("my num 0 length -->> "+myNums[0].length);
//
//            System.out.println("my num 0 2 element -->> "+myNums[0][2]);
//
//            System.out.println("my num 0 3 element -->> "+myNums[0][3]);



        }


}
