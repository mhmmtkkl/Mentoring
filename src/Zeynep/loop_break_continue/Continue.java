package loop_break_continue;

public class Continue {

    public static void main(String[] args) {

        /**
         continue

         this continue statement will break the iteration if specified condition is occured,
         then will keep iterate in the loop

         */

        String sentence = "hola @ gmail. com";
        for (int i = 0; i < sentence.length(); i++){

            char ch = sentence.charAt(i);

            if (ch == ' '){
                continue;
            }
            System.out.print(ch);
        }


    }
}
