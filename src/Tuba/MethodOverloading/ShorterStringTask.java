package Tuba.MethodOverloading;

import java.util.ArrayList;

public class ShorterStringTask {
    /*
     Write a method removeShorterStrings that takes an ArrayList of Strings as a parameter and
     that removes from each successive pair of values the shorter string in the pair.
     For example, suppose that an ArrayList called list contains the following values:
     {"four", "score", "and", "seven", "yea", "ago","uuuuu"} In the first pair, "four" and "score", the shorter string is "four".
      In the second pair, "and" and "seven", the shorter string is "and".
      In the third pair, "years" and "ago", the shorter string is "ago".
      Therefore, the call: removeShorterStrings(list); should remove these shorter strings,
      leaving the list as follows: "score", "seven", "years".
      If there is a tie (both strings have the same length),
      your method should remove the first string in the pair.
      If there is an odd number of strings in the list, the final value should be kept in the list.
     */


    public static ArrayList<String> removeShorterString(String... names) {  // String [] arr={"tug","nnn"}
        ArrayList<String> list1 = new ArrayList<>();

        for (String each : names) {
            list1.add(each);              // I added each element from array to arraylist
        }

        for (int i = 0; i < list1.size() - 1; i++) {
            int length1 = list1.get(i).length();
            int length2 = list1.get(i + 1).length();
            if (length1 <= length2) {
                list1.remove(i);
            } else if (length2 > length1) {
                list1.remove(i + 1);
            }
        }

        return list1;
    }

    public static void main(String[] args) {
        ArrayList<String> myNewList = removeShorterString("Samil", "Omer", "Tugba", "Hacer", "Muhammed");

        System.out.println(myNewList);
    }
}
