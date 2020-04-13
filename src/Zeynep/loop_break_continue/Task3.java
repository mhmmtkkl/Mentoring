package loop_break_continue;

public class Task3 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0 ; i <= 10; i++){

            //sum += i;
            if (i == 5){
                break;
            }
            sum += i;  //if you put sum before if statement, it will count number 5 and result will be different

        }System.out.println(sum);
    }
}
