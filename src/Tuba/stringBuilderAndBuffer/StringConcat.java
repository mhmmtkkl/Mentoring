package Tuba.stringBuilderAndBuffer;

public class StringConcat {
    public static void main(String[] args) {
        /*
         Why do we need StringBuilder?
         What is the advantage of it?
         How to initialize Strings?
         String literals and String constant pool
         How to initialize StringBuilder?

         */


        String str = "a";
        System.out.print("First location in the memory : ");
        System.out.println(str.hashCode());
        str = str.concat("b");
        System.out.print("Second location in the memory : ");
        System.out.println(str.hashCode());
        str = str.concat("c");
        System.out.print("Third location in the memory : ");
        System.out.println(str.hashCode());


        // StringBuilder
        System.out.println("--------------------");
        StringBuilder sb = new StringBuilder("a");
        System.out.println(sb.capacity());
        System.out.println("Memory of the stringbuilder: " + sb.hashCode());
        sb.append("b");
        System.out.println("Memory of the stringbuilder after the append: " + sb + " " + sb.hashCode());
        sb.insert(0, "c");
        System.out.println("Memory of the stringbuilder after the insertion: " + sb + " " + sb.hashCode());

        // StringBuffer

        System.out.println("------------------");
        StringBuffer sbuffer = new StringBuffer("Hi");
        System.out.println(sbuffer);
        System.out.println(sbuffer.capacity());


    }
}
