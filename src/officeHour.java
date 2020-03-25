public class officeHour {

    public static void main(String[] args) {

//        Sting methods ( index of , last inde of , trim , concat , char at , toString , replace first replace all ) 6-7pm

//        index of  Start counting from 0

        String name = "Techno Study";

        System.out.println(name.indexOf('T'));

//        last Index of Start counting from 0

        String password = "youtube";

        System.out.println("last index of --->>> "+password.lastIndexOf('u'));

//        trim  remove space from beginning and end

        String name2 = "        Techno Study        ";

        System.out.println("name2 with out trim  -->>>>  "+name2);

        System.out.println("name2 with trim   --->>>> "+name2.trim());


//      concat  adding the text in the string

        String str3 = "my ";

        str3 = str3.concat("name ").concat("is Ali .");

        System.out.println(str3);

//        char at printing the char which is in the specific position start from 0

        String str4 = "United States";

        System.out.println(str4.charAt(0));

        System.out.println(str4.charAt(8));


//        replace

        String myName = "Ali Kokluii";

         myName.replace('i' , 'k');

        System.out.println("my name before assign to itself is here -->> "+myName); //result = Ali Kokluii

        myName = myName.replace('i','k');

        System.out.println("my name after assign to itself is here -->> "+myName);//result = Alk Koklukk

        String num1 = "$80.00";

        String num2 = "$120.00";

        num1 = num1.replace("$","");

        num2 = num2.replace("$","");

        System.out.println("num1 is == > "+num1 );

        System.out.println("num2 is == > "+num2);

        double num1Double  = Double.valueOf(num1);

        double num2Double  = Double.valueOf(num2);

        double total = num1Double + num2Double;

        System.out.println( total);


//        replace all

        String str = "how to do in java provides java tutorials";

        String newStr = str.replaceAll("java", "scala"); //change java to scala

        System.out.println(newStr);

        newStr = str.replaceAll("\\s", "");  // remove white spaces

        System.out.println(newStr);

        String number = "Amount of the ticket is $140";

        String numberWithOutLetter = number.replaceAll("[a-zA-Z]", ""); //remove all letters

        System.out.println(numberWithOutLetter.trim());

        String justNumbers = number.replaceAll("[^\\d.]", "");

        System.out.println(justNumbers);

//   substring in java

        String mySentence = "Techno study";

        mySentence = mySentence.substring(4);

        System.out.println(mySentence);

        String mySentence2 = "Techno study";

        mySentence2 = mySentence2.substring(2 , 8);

        System.out.println(mySentence2);

    }
}
