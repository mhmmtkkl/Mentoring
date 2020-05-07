package Ali.aastudy.Week8;

public class Unique {

    /*

        Create one method name is unique
        Parameter is String
        Return type is true or false

        If the String is unique return true
        else return false

     For example:
        String is mouse

        return should be true

     */

    public boolean uniqueMethod(String myStr){

        char[] strChar = myStr.toCharArray();

        boolean result = true;

        for(int i = 0 ; i < strChar.length ; i++){
              for(int j = i+1 ; j < strChar.length ; j++){

                if(strChar[i]==strChar[j]){
                    result = false;
                    break;
                }
            }
        }

        return result;

    }



}
