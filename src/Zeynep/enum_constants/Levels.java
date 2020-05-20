package enum_constants;

public enum Levels {

    /*
    what is enum?

    it is a special class that stores only constants (unchangable things)

    constants do not have data types, only have list of things you not to change

    enums can have methods, (only private by default)constructor and field


     */
    strawberry(2),
    choccalate(1),
    hazelnut(3);

    public int scopeSize;

    Levels(int size){
        scopeSize = size;
    }

    @Override
    public String toString() {
        return "Levels{" +
                "scopeSize=" + scopeSize +
                '}';
    }
}
class Flavor{
    public static void main(String[] args) {
//        String[] array= {"strawberry","choccalate", "hazelnut"};
//        for (String s : array) {
//            System.out.println(s);
//        }

//        Levels level = Levels.hazelnut;
//        System.out.println(level);


        //todo how can print all constants from enum?

        Levels[] flavor = Levels.values();  //.values method will return an array of constans
        for (Levels levels : flavor) {
            System.out.println(levels);
        }

    }
}


