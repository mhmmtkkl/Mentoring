package loop_break_continue;

public class Break {

    public static void main(String[] args) {
        /**
         break

         we can control the loop to terminate from there.
         basically used for out of jump from loop

         mostly it is used with if- else statement

         */

        String text = "keep@calm";

        for (int i =0; i <= text.length(); i++){

            char letter = text.charAt(i);

            if (letter == '@'){
                break;
            }
            System.out.print(letter);
        }



    }
}
