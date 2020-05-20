package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {

    /*

    Write a method markLength4 that takes an ArrayList of Strings as a parameter and
    that places a string of four asterisks "****" in front of every string of length 4.
    For example, suppose that a variable called list contains the following values:
    {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}
    And you make the following call: markLength4(list); then list should store the following values after the call:
    {"****", "this", "is", "****", "lots", "of", "fun", "for", "every", "****", "Java", "programmer"}

     Notice that you leave the original strings in the list, "this", "lots", "Java",
     but include the four-asterisk string in front of each to mark it.
     */

    public static ArrayList<String> createArrayList(String... values){

        ArrayList<String> words = new ArrayList<>(values.length);

        words.addAll(Arrays.asList(values));

        return words;
    }

    public static void printTheList(ArrayList<String> names ){
        System.out.println(names);
    }

    public static ArrayList<String> markLength4(ArrayList<String> words, String asterix){

        for (int i = 0; i < words.size(); i++) {

            String eachWords = words.get(i);

            if (eachWords.length() == 4){

                words.add(i,asterix);
                i++;
            }

        }
        return words;
    }

    public static void main(String[] args){

        ArrayList<String> words = createArrayList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer");
        printTheList(words);

        markLength4(words,"****");
        printTheList(words);
    }

}
