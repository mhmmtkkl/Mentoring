package object_class;
/*
create a class Person
add 2 attributes which are called name and lastName
add a method returns first 2 letters of name and last 2 letters of lastName
call all attributes and method under main method
 */
public class Task3 {

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Zeynep";
        person.lastName = "Ucar";

        //person.wordMix();




        String wordMix = wordMix(person);
        System.out.println(wordMix);
    }
//    public static  String  mixingWord(String username, String lastname){ //not secure
//
//        return username.substring(0,2) + lastname.substring(lastname.length()-2);
//    }

    public static String wordMix(Person person){
        return person.name.substring(0,2) + person.lastName.substring(person.lastName.length()-2);

    }


}

class Person{
    String name;
    String lastName;

//    String wordMix(){
//
//        return name.substring(0,2) + lastName.substring(lastName.length()-2);
//    }

}
