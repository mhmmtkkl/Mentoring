package April14th;

public class Task3 {
    public static void main(String[] args) {
            //Create a 2D String array
            //put the following values
           String array[][]= {
                        {"techno","study"},
                        {"atlanta","new jersey"},
                        {"ohio","brooklyn"},
                        {"pittsburgh"}
           };
           int sum =0,count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j].length();
                count++;
            }
        }
        System.out.println("The average length of the strings is: "+ (sum/count));
    }
}
