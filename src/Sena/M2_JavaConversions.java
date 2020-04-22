package Sena;

public class M2_JavaConversions {
    public static void main(String[] args) {

        /**
         * Presentation link:
         * https://docs.google.com/presentation/d/1150SQ134ZaPnP8Ip3gKLCPFtlZ3-dGUp05MKr9uDOU8/edit?usp=sharing
         */

        // widening casting automatically done by java as shown
        byte byte1 = 19;
        byte byte2 = 46;
        int int1 = byte1;
        int int2 = (byte1 + byte2) * int1;
        double double1 = int2;


//        // ... but when we want to narrow down, we have a compile error
//        int intToDouble1 = double1;
//
//        // to be able to successfully convert from a bigger to smaller data type,
//        // type casting is needed:
//        int intToDouble2 = (int) double1;
//
//
//
//        // primitive to String:
//        byte byte1 = 127;
//        short short1 = 286;
//        char char1 = 'a';
//        int int1 = 7398;
//        long long1 = 12;
//        float float1 = 92;
//        double double1 = 0.000002;
//
//        // String.valueOf() and PrimitiveType.toString() methods
//        String primitiveToString = String.valueOf(byte1);
//        primitiveToString = String.valueOf(short1);
//        primitiveToString = Integer.toString(int1);
//        primitiveToString = Long.toString(long1);



        // String to primitive:
        // PrimitiveType.parsePrimitiveType and PrimitiveType.valueof()

        String StringToPrimitive = "123";
        int myInt = Integer.parseInt(StringToPrimitive);
        byte myByte = Byte.valueOf(StringToPrimitive);
        long l = Long.parseLong(StringToPrimitive);





        int x = 12;
//        double y = x++;
        double z = ++x;

//        System.out.println(z);


        short sh = 129;
        byte b1 = (byte) sh;
        // -128 till 127 
        System.out.println(b1);













    }
}
