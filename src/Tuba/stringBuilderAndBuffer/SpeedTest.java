package Tuba.stringBuilderAndBuffer;

public class SpeedTest {
    public static void main(String[] args) {
        // Initialization time for String
        // Literal
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            String s1 = "Hello";
            String s2 = "Welcome";
        }

        long end1 = System.currentTimeMillis();
        long total_time = end1 - start1;

        System.out.println("Time taken to execute" +
                " string literal = " + total_time);

        // Initialization time for String
        // object
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            String s3 = new String("Hello");
            String s4 = new String("Welcome");
        }

        long end2 = System.currentTimeMillis();
        long total_time1 = end2 - start2;

        System.out.println("Time taken to execute" +
                " string object=" + total_time1);

        // StringBuiilder

        long start3 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            StringBuilder s3 = new StringBuilder("Hello");
            StringBuilder s4 = new StringBuilder("Welcome");
        }

        long end3 = System.currentTimeMillis();
        long total_time2 = end3 - start3;

        System.out.println("Time taken to execute" +
                " string builder=" + total_time2);

        // StringBuffer
        long start4 = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            StringBuffer s3 = new StringBuffer("Hello");
            StringBuffer s4 = new StringBuffer("Welcome");
        }

        long end4 = System.currentTimeMillis();
        long total_time3 = end4 - start4;

        System.out.println("Time taken to execute" +
                " string buffer=" + total_time3);
    }
}


