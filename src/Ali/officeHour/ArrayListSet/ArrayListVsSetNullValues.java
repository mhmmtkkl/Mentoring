package Ali.officeHour.ArrayListSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ArrayListVsSetNullValues {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Samsung");
        a1.add("Apple");
        a1.add("LG");
        a1.add("XiaoMi");
        a1.add("Nokia");
        a1.add("XiaoMi");
        a1.add("Nokia");
        a1.add(null);
        a1.add(null);

        HashSet<String> h1 = new HashSet<>();

        h1.add("Samsung");
        h1.add("Apple");
        h1.add("LG");
        h1.add("XiaoMi");
        h1.add("Nokia");
        h1.add("XiaoMi"); // While printing Set will display one XiaoMi and Nokia because Set doesnt accept duplicate values
        h1.add("Nokia");
        h1.add(null);
        h1.add(null);

        for(int i = 0 ; i < a1.size() ; i++){
            System.out.println(a1.get(i));
        }

        System.out.println("-----------");

        for(String value:h1){
            System.out.println(value);
        }

        TreeSet<String> t1 = new TreeSet<>();

        t1.add("samsung");
//        t1.add(null);  TreeSet is not accepting any null values

        System.out.println(t1);

    }


}
