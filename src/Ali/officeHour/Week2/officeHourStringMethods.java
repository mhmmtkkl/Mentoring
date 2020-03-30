package Ali.officeHour.Week2;

public class officeHourStringMethods {

    public static void main(String[] args) {

        // String methods (index of , last index of , trim , replace and replace all )

//        index of    -->>  position of the character , Start counting from zero

        String name = "Techno Studyn";

        System.out.println("index of is here -->> "+name.indexOf('n'));

//        last index of   --> position of the last character , Starting from zero

        System.out.println("last index of is here -->> "+name.lastIndexOf('n'));

//        System.out.println("multiple characters -->> " + name.indexOf('T' , 'S'));

        int positionOfS = name.indexOf('S');
        System.out.println("index of second example --> " + positionOfS);

//      trim  -->> removing all the spaces in the beginning and in the end

        String state = "      new      jersey     ";

        System.out.println("without trim -->> "+state);

        System.out.println("with trim -->> " + state.trim());

//      replace --> is replacing one character with another character

        String country = " United States and Germany " ;

        country = country.replace('a' , 'K');

        System.out.println("replace "+country);  //United Stktes knd Germkny

        String country2 = "Brazil and France";

        country2 = country2.replace('r' , 'O');

        System.out.println("replace r to O in the String -->> "+country2);

        System.out.println("------------------");


        String num = "$18";

//      remove the $ from the String

        num = num.replace("$", "");

        System.out.println("number with out $ sign "+num);


        String state2 = "new jersey";

        state2 = state2.replace("new" , "old");

        System.out.println("change the word with a replace -->> "+state2);


//       replace all

        String sentence = "I am traveling from london to new york";

        sentence = sentence.replaceAll("\\s" , "4"); //remove all the spaces

        System.out.println("remove all the spaces -->"+sentence);




        String number = "$18MM";

        number = number.replaceAll("[a-zA-Z]" , ""); // remove all the letters

        System.out.println(number);



        String number2 ="$1800KK";

        number2 = number2.replaceAll("[^\\d.]" , "");

        System.out.println(number2);

//      substring --> revoving the characters from one postion to other position

        String myName = "Ali Koklu";

        myName =  myName.substring(4 , 9);

        System.out.println(myName);

        String myName2 = "California is good";

        System.out.println(myName2.length());
        myName2 = myName2.substring(myName2.lastIndexOf("s") , myName2.length());

        System.out.println(myName2);


    }

}
