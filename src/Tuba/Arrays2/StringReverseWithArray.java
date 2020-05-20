package Tuba.Arrays2;

public class StringReverseWithArray {
    public static void main(String[] args) {
        // reverse the array and reverse the each element in the String array

        String[] strArray = {"a r a k n A", "n o t f i l C ", "g n i m m u C"};

        for (int i = strArray.length - 1; i >= 0; i--) {
           // System.out.print(strArray[i] + " ");
            char[] ch = strArray[i].toCharArray();  // I am converting each string to char
            for (int j = ch.length - 1; j >= 0; j--) {
             //   System.out.print(ch[j] + " ");
            }
         // //  System.out.println();
        }



        // reverse the 2 dimensional array
        // reverse the each element in the 2D String array

        String[][] twoDimenArray = {{"London", "Rome"}, {"Istanbul", "Ankara", "Bursa"}, {"Pakistan", "USA", "Mexico"}};
        // {{"Pakistan", "USA", "Mexico"},{"Istanbul", "Ankara", "Bursa"},{"London", "Rome"}}
        // {{"Mexico", "USA", "Pakistan"},

        for( int i= twoDimenArray.length-1 ; i>=0 ; i--){
            for(int j=twoDimenArray[i].length-1 ; j>= 0; j--){
                //System.out.print(twoDimenArray[i][j]+ " ");
                char [] chars= twoDimenArray[i][j].toCharArray();
                System.out.println();
                for(int k=chars.length-1; k>=0 ; k--){
                    System.out.print(chars[k]+ " ");
                }
            }

        }

    }
}
