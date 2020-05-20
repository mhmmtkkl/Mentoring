package static_constructor;

public class Task1 {
    //step1 create a class called Length
    //add 1 String attribute named word
    //add a int method returns length of word

    //step2 create Password class
    //add a boolean attribute named isValid

    //step3 call all length and password class under main method
    //create a static boolean method named isValidOrNot that checks if the length is bigger than 6 and
    // smaller than 10 returns true, otherwise returns false does not meet condition.
    //validate the length Of word meet condition under main method.

    public static void main(String[] args) {
        Length mineWord = new Length();
        //mineWord.word = "technoStudy";
        mineWord.word = "technos";

        int size = mineWord.lengthOfWord(mineWord.word);
        System.out.println(isValidOrNot(size));

//        Length length = new Length();
//        Password password = new Password();
//        length.name = "ali";
//        System.out.println(Password.isValidOrNot(length.lengthOfWord(length.name))

    }

    public static boolean isValidOrNot(int length){

        Password pass = new Password();

        if (length >= 6 && length <=10){
            pass.isValid = true;
        }else {
            pass.isValid = false;
        }
        return pass.isValid;
    }
}

//step1
class Length{
    String word;

    public int lengthOfWord(String word){ //non-static method
        this.word = word;
        return this.word.length();
    }
}
//step2

class Password{
    boolean isValid;

//    static boolean isValid;
//
//    static boolean isValidOrNot (int l){
//        if(l>6 && l<10){
//            isValid = true;
//        }else{
//            isValid = false;
//        }
//
//        return isValid;
//    }
}
