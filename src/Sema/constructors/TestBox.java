package Sema.constructors;
//Java program to illustrate
//constructor Overloading
class Box{
    double width,height,depth;
    //constructor used when all dimensions specified
    Box(double w,double h,double d){
     width=w;
     height=h;
     depth=d;
    }
    //constructor used no dimensions specified
    Box(){
        width=height=depth=0;
    }
    //constructor used when cube is created
    Box(double len){
        width=height=depth=len;
    }
    //compute and return volume;
    double volume(){
        return width*height*depth;
    }
}

//Driver code
public class TestBox {


    public static void main(String[] args) {
        //create boxes using the various constructor
        Box myBox1=new Box(10,20,15);
        Box myBox2=new Box();
        Box myBox3=new Box(7);

        double vol;

        //get volume of first box
        vol=myBox1.volume();
        System.out.println("volume of mybox1 is:"+vol);

        //get volume of second box
        vol=myBox2.volume();
        System.out.println("volume of mybox1 is:"+vol);

        //get volume of cube
        vol=myBox3.volume();
        System.out.println("volume of mybox1 is:"+vol);
    }

}
