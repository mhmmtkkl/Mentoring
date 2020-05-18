package set;

import java.util.HashSet;

public class SetEx {



        /*
             Array                                    ArrayList                                         HashSet

      int[] arr = new int[];          ArrayList<integer> list= new ArrayList<>();          HashSet<Integer> set = new HasSet<>();
      int[] arr = {1,3,5,6};

      ~it has fixed size               ~it has dynamic size, resizable

                                     >> maintains insertion order                          >>  does not maintain insertion order (it is not index based)

                                     >>accept duplication                                  >> does not accept duplication





                                                                                   LinkedHashSet                                TreeSet

                                                                               maintain insertion order                  sort based on natural order



         */


    //Write a Java program to compare two sets and retain elements which are same on both sets.

    //step1 create a method returns a HashSet that converts array to HashSet
    //{35, 12, 67, 45, 32}  and {12, 67, 45, 33, 98}

    public static HashSet<Integer>  convertToArrayToHashset(HashSet<Integer> set, int[] array){

        for (int i : array) {

            set.add(i);

        }

        return set;

    }

    //step2 create a method returns HashSet that stores all elements inside

    public static HashSet<Integer> totalElements(HashSet<Integer> set1, HashSet<Integer> set2){

        HashSet<Integer> totalElemnt = new HashSet<>();

        totalElemnt.addAll(set1);
        totalElemnt.addAll(set2);

        return totalElemnt;

    }




    //step3 create a method returns HashSet that stores only common elements inside

    public static HashSet<Integer> commonElements(HashSet<Integer> set1, HashSet<Integer> set2){

        HashSet<Integer> commonElements = new HashSet<>();

        commonElements.addAll(set1);
        commonElements.retainAll(set2);

        return commonElements;
    }




    //step4 please call all methods under main method

    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        convertToArrayToHashset(set1,new int[]{35, 12, 67, 45, 32});
        convertToArrayToHashset(set2,new int[]{12, 67, 45, 33, 98});

        System.out.println(set1);
        System.out.println(set2);


        HashSet<Integer> totalElemnt = totalElements(set1,set2);

        System.out.println("all elements are here  "+ totalElemnt);

        HashSet<Integer> commonElements = commonElements(set1, set2);

        System.out.println("only common elemnts " + commonElements);



    }

}
