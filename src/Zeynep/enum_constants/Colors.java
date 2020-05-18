package enum_constants;

public enum Colors {
    /*
    create color enum, it has secondary colors as constants like purple
    it accepts 2 String primary colors as parameters purple( "red", "blue")
    print out using toString method

     */
    purple("red","blue"),
    green("blue", "yellow"),
    pink("red","white"),
    orange("red","yellow");

    private final String one;
    private final String two;

    Colors(String color1, String color2){
        one = color1;
        two = color2;
    }


    public String toString() {
        return "Colors{" +
                "one='" + one + '\'' +
                ", two='" + two + '\'' +
                '}';
    }
}

class Color{
    public static void main(String[] args) {
        Colors[] values = Colors.values();
        for (Colors value : values) {
            System.out.println(value.name() + ">>" +value);
        }
    }

}
