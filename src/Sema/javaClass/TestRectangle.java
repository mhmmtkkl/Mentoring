package Sema.javaClass;
//Java Program to illustrate the use of Rectangle class which has length and width data members
class Rectangle{
    int length;
    int width;
    //create insert data method
    void insert(int l,int w){
        length=l;
        width=w;
    }
    //create calculate Area and print
    void calculateArea(){
        System.out.println(length*width);
    }
}
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(),r2=new Rectangle(); //creating two objects
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea();
        r2.calculateArea();
    }
}
