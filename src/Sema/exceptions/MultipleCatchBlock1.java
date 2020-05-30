package Sema.exceptions;

public class MultipleCatchBlock1 {
    public static void main(String[] args) {
        try{
            int a[]=new  int[5];
            a[5]=30/0;
//            System.out.println(a[10]);

//           String s=null;
//             System.out.println(s.length());


        }
        catch (ArithmeticException e)
        {
            System.out.println("arithmetic exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutBounds exceptions occur");
        }
        catch (Exception e)
        {
            System.out.println("Parent exception occurs");
        }

        System.out.println("Rest of the code");
    }
}
