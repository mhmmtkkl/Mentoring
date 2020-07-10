package Ali.aastudy.Encapsulation.intro;

public class introEncapsulation {

    /*
        What is encapsulation?
            1) Better control class attributes.
            2) Can make attributes read only(get method) and write only
            3) Encapsulation is mainly used to protect data, to protect the data variables must be private and
            and they can only be accessible by methods.
     */

     private String name ;
     private int age;

//     this variable is readable because there is no any set method
     private int priceOfTheCar = 20000;


     public int getPriceOfTheCar(){
         return priceOfTheCar;
     }

     public void setName(String name){
         this.name=name;
     }

     public String getName(){
         return name;
     }

     public void setAge(int age){
         this.age= age;
     }

     public int getAge(){
         return age;
     }


}
