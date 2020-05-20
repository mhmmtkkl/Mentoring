package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {

    /*
     Write a method removeDuplicates that takes as a parameter a sorted ArrayList of Strings
     and that eliminates any duplicates from the list. For example,
     suppose that a variable called list contains the following values:
     {"be", "be", "is", "not", "or", "question", "that", "the", "to", "to"}
     After calling removeDuplicates(list); the list should store the following values:
      {"be", "is", "not", "or", "question", "that", "the", "to"}

Because the values will be sorted, all of the duplicates will be grouped together.

     */

    public static ArrayList<String> createList(String... values){

        ArrayList<String> words = new ArrayList<>(values.length);

        words.addAll(Arrays.asList(values));

        return words;

    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> words){

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i) == words.get(i+1) ){
                words.remove(i+1);
            }
        }

        return words;
    }

    public static void main(String[] args){

        ArrayList<String> words = createList("be", "be", "is", "not", "or", "question", "that", "the", "to", "to");

        System.out.println(words);

        removeDuplicates(words);

        System.out.println(words);

    }



}
