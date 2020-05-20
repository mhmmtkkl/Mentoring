package Sena.M3_MethodReturnTypes;

public class M3_MethodReturnTypes {

    /**
     * Presentation link:
     * https://docs.google.com/presentation/d/1pJsnRnEhVRzBvCYRCCxeYOBzWBrhP01SWreAw-2WXlQ/edit?usp=sharing
     */



    // TASKS:

    // 1. Mary, John, Alice, Kyle and Edson are a family of 5. All of them are working.
    // Create a method of how much tax they are paying by
    // getting the 7 percent of each of their income and summing all up

    // acceptance criteria:
    // have 5 ints as incomes as your parameters, return a double

    // formula: access modifier (public) + return type (double) + name
    // + (parameters) + { all the work and the return; }


        public double taxCalc (int income1, int income2, int income3, int income4, int income5) {
            int [] arr = {income1,income2, income3, income4, income5};
            // double i1 = income1 * 7 / 100;

            double taxTotal = 0.0;
            for (int i = 0; i < arr.length; i++) {
                taxTotal += (double) (arr[i] * 7 / 100);
            }

            return taxTotal;
        }





    // 2. A writer just finished writing a book,
    // while reviewing her work she noticed that she used "cause" instead "because"
    // and want to change it all before publication.
    // Create a method searching for a word inside of an ArrayList <String>
    // and change it to another word

    // acceptance criteria:
    // have an Arraylist <String> book, String wordInitial and String wordFinal as parameters,
    // return ArrayList <String>

        /** write code here
         *
         */


}
