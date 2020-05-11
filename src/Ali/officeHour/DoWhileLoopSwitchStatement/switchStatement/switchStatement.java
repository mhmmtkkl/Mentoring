package Ali.officeHour.DoWhileLoopSwitchStatement.switchStatement;

public class switchStatement {

    /*
    * Switch statement
    * */

    public static void main(String[] args) {

        int num = 7;

        // if the num is = 1 print Month is january
        // if the nume is 2 print Month is February
        switch (num){
                case 1:
                    System.out.println("Month is january");
                    break;
                case 2:
                    System.out.println("Month is February ");
                    break;
                case 3:
                    System.out.println("Month is March");
                    break;
                case 4:
                    System.out.println("Month is april");
                    break;
                case 5:
                    System.out.println("Month is May");
                    break;
                default:
                    System.out.println("This is more then my conditions");
        }

        if(num==1){
            System.out.println("Month is january");
        }else if(num==2){
            System.out.println("Month is February");
        }

        /*
            NOTE: In Switch statement I can not use boolean in the case it should be int (in out example)

            if statement condition is always boolean
         */
    }

}
