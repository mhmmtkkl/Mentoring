package Sena.M7_StringBuilderStringBuffer;

public class Summary {

    /**
     * Presentation Link:
     * https://docs.google.com/presentation/d/1FJxNjsimlU9ZVohMZeqY9gpMdkLNjPwob2LtdB9zPwI/edit?usp=sharing
     */

    public static void main(String[] args) {

        // StringBuilders and StringBuffers differ from Strings as they are mutable (changeable)

        // StringBuilder is faster than StringBuffer, and is not thread-safe compared to StringBuffer

        // To be able to use both classes, you need to create objects out of them

        StringBuilder stringBuilder = new StringBuilder();

        StringBuffer stringBuffer = new StringBuffer();

        // StringBuilders and StringBuffers have almost the same exact methods:

        stringBuilder.append(1);
        stringBuffer.append("a");

        stringBuilder.insert(1, 2);
        stringBuffer.insert(1, 'b');

        System.out.println(stringBuilder);
        System.out.println(stringBuffer);



    }
}
