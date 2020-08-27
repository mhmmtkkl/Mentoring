package Ali.InterviewMentoring.Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setDifference {

    /*
          ArrayList vs Set

          ArrayList is printing as inserted order
          Set is printing different way (Check the order difference in the set)

          ArrayList accept multiple null values
          Set accept single null value (Except treeset -> not accepting any null value . tree will throw null pointer exception)

          ArrayList accept duplicated values
          Set accept single value

          ArrayList While getting the data from arraylist we can use .get() method
          Set While getting the data from set we have to use forEach loop

        ORDER DIFFERENCE IN THE SET
        Order
        HashSet does not maintain insertion order
        LinkedHashSet maintains insertion order of objects
        While TreeSet orders of the elements according to alphabetical order or numbers from small to big number

        Performance	HashSet > TreeSet > LinkedHashset

     */

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Lion");
        a1.add("Tiger");
        a1.add("Dog");
        a1.add("Elephant");
        a1.add("Cat");
        a1.add("Elephant");
        a1.add(null);
        a1.add(null);
        a1.add(null);
        a1.add(null);
        System.out.println("ArrayList  ---->>>>>    "+a1);

        HashSet<String> s1 = new HashSet<>();
        s1.add("Lion");
        s1.add("Tiger");
        s1.add("Dog");
        s1.add("Elephant");
        s1.add("Cat");
        s1.add("Elephant");
        s1.add(null);
        s1.add(null);
        s1.add(null);
        s1.add(null);
        System.out.println("HashSet  ---->>>>>    "+s1);

        TreeSet<String> s2 = new TreeSet<>(); // not able to add any null value
        s2.add("Lion");
        s2.add("Tiger");
        s2.add("Dog");
        s2.add("Elephant");
        s2.add("Cat");
        s2.add("Elephant");
        System.out.println("TreeSet --->>>  "+s2);

        LinkedHashSet<String> s3 = new LinkedHashSet<>();
        s3.add("Lion");
        s3.add("Tiger");
        s3.add("Dog");
        s3.add("Elephant");
        s3.add("Cat");
        s3.add("Elephant");
        s3.add(null);
        s3.add(null);
        s3.add(null);
        s3.add(null);
        System.out.println("Linked Hash set --->>>>>    "+s3);

    }


}
