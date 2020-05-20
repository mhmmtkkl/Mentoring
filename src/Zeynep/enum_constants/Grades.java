package enum_constants;

/*
step1>>>create an enum class that stores 4 constants like excellent, good, pass, fail
print out each constant inside main method

step2>>>add min and max number as parameters to show the range of grades like (excellent : min 81, max 100)
print out this parameters inside main method (using by toString method or creating different methods)

step3>>>add switch statement
for example:  for excellent print out excellent means A and A+
*/

public enum Grades {

    excellent(81,100),
    good(71,80),
    pass(55,70),
    fail(0,54);

    private final int min;   //field
    private final int max;

    Grades(int down, int up){   //constructor
        min = down;
        max = up;
    }

//    public int getMin(){
//        return this.min;
//    }


    public String toString() {
        return "Grades{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
class GradesOfStudent{

    public static void main(String[] args) {
        Grades[] values = Grades.values();

        for (Grades value : values) {
            System.out.println(value.name() + value);
        }


        Grades grad = Grades.good;
        switch (grad){
            case excellent:
                System.out.println("means A and A+");
                break;

            case good:
                System.out.println("means B and B+");
                break;

            case pass:
                System.out.println("means C and c+");
                break;

            case fail:
                System.out.println("means F");
                break;
        }

//        System.out.println(grad.getMin());
    }
}
