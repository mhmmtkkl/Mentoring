package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {

    //Write a method removeEvenLength that takes an ArrayList of
    // Strings as a parameter and that removes all of the strings of even length from the list.



    //first >>>> create a String ArrayList
    public static ArrayList<String> createAlistOfElement(String... listOfName){ // String[] listOfName   varArgs store as an array

        ArrayList<String> names = new ArrayList<String>(listOfName.length);

        names.addAll(Arrays.asList(listOfName));

        return names;
    }

    public static void printTheList(ArrayList<String> names ){
        System.out.println(names);
    }

    //second>>> remove the even length of names from list

    public static ArrayList<String> removeEvenLength(ArrayList<String> namesList){

        for (int i = 0; i < namesList.size(); i++) {

            String eachName = namesList.get(i);//unboxing
            if (eachName.length()%2==0){

                namesList.remove(i);
                i--;  //when i did not add this, gave me size of 4?

            }

        }

        return namesList;
    }

    //third >>> create a main method
    public static void main(String[] args) {

        ArrayList<String> names = createAlistOfElement("James", "Jessica", "Michael", "Jane", "John");
        printTheList(names);
        removeEvenLength(names);
        printTheList(names);
    }
}
