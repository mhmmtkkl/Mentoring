package Tuba.arrays;

public class DeclaringArrays {
    public static void main(String[] args) {
        // initializing with length
        int[] array = new int[5]; // you use only integer
        array[0]=1;
        array[1]=2;
        array[2]=0;
        array[3]=4;
        array[4]=6;


        // initializing the array with the elements
        int[] arr = {1, 2, 3, 4};

        double []doubleArray={1.2,2.3,5.0};

        char[] ch = {'a', 'b', 'c'};



        // indexes start from 0

        // finding the length
        int length=arr.length;  // length is 4

        // loop through printing

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//
//        }

        // each loop
      String[] myStrArray = {"New York", "Georgia", "New Jersey"};
        for(String myNew:myStrArray){
            System.out.println(myNew);
        }

        // Arrays.toString()

       // System.out.println(Arrays.toString(doubleArray));

        // how to change the element of an array?

        myStrArray[0]="Florida";
        for(int j=0;j<myStrArray.length;j++){
            myStrArray[1]="Boston";
            System.out.println(myStrArray[j]);
        }

    }
}
