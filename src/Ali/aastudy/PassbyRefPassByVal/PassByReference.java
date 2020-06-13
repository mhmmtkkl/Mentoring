package Ali.aastudy.PassbyRefPassByVal;

public class PassByReference {

    int myNumber;

    public void add(int[] num){

        num[0] = 150;

        System.out.println("i1[0] after the add method --> "+num[0]);

    }

    public static void main(String[] args) {

        PassByReference p1 = new PassByReference();

        int[] i1 ={100 , 110};

        System.out.println("i1[0] before the add method --> "+i1[0]);

        p1.add(i1);

        System.out.println("i1[0] after the add method --> "+i1[0]);

    }
}
