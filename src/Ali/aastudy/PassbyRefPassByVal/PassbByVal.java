package Ali.aastudy.PassbyRefPassByVal;

public class PassbByVal {

    public void add(int num){

        num = num + 10;

        System.out.println("num in the method --> " + num);

    }

    public static void main(String[] args) {

        int myNumber= 100;

        PassbByVal p1 = new PassbByVal();

        System.out.println("my num before the add method --> "+myNumber);

        p1.add(myNumber);

        System.out.println("my num after the add method --> "+myNumber);

    }
}
