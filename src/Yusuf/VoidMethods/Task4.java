package April15th;

public class Task4 {
    //Task 4
    //Create method that tells how many vowels does each word have
    // Ex: The first word has 5 vowels
    //     The second word has 2 vowels
    public static void main(String[] args) {
    checkSentence("I love java");
    }
    public static void checkVowel(String str){
        int count =0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void checkSentence(String str){
        String array[]=str.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("The word " + array[i] + " has ");
            checkVowel(array[i]);
            System.out.println(" vowels");
        }
    }
}
