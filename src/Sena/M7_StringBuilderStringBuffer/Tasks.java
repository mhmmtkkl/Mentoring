package Sena.M7_StringBuilderStringBuffer;

public class Tasks {

    /**
     * Task 1:
     * // Create a method named as addNTimes
     * // Return type is StringBuilder, Parameters are String str and int number
     * // Create a StringBuilder and add the String provided to the StringBuilder as much as the int number provided
     **/

    public static StringBuilder addNTimes(String str, int number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number; i++) {
            sb.append(str);
        }
        return sb;
    }


    /**
     * Task 2:
     * Create a method named as addFrom2DArray
     * Return type is StringBuilder, Parameter is String [][] arr
     * Add all variables to the StringBuilder starting backwards
     */

    public static StringBuilder addFrom2DArray(String[][] arr) {
        StringBuilder stb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                stb.append(arr[i][j]);
            }
        }
        return stb;
    }

    /** Task 3:
     // Create a method reverseStringBuilder
     // Return type is StringBuffer, Parameter is StringBuilder
     // Covert the StringBuilder into a StringBuffer and reverse it
     **/

    public static StringBuffer reverseStringBuilder (StringBuilder stringBuilder) {
        StringBuffer sbf = new StringBuffer(stringBuilder);
        sbf.reverse();
        return sbf;
    }


    /** Task 4:
     * Create a method stringBufferToString
     * Return type is String, Parameter is StringBuffer
     * Covert StringBuffer to String
     */

    public static String stringBufferToString (StringBuffer stringBuffer) {
        return stringBuffer.toString();
    }


}
