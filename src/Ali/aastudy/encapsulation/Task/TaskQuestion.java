package Ali.aastudy.encapsulation.Task;

public class TaskQuestion {

    /*
        Create 3 private instance variable.
        int roomCount
        boolean isBalconyAvailable
        int price

        roomCount is write only
                room count should be 0 or 1
                    if the count is not 0 or 1 then
                      print Room count is not valid
                      and make the roomCount as -1

        isBalconyAvailable is write only

        price is read only

        if the roomCount equal to 0
        isBalconyAvailable false
        price is equal to 1000

        if the roomCount equal to 0
        isBalconyAvailable true
        price is equal to 1200

        if the roomCount equal to 1
        isBalconyAvailable false
        price is equal to 1500

        if the roomCount equal to 1
        isBalconyAvailable true
        price is equal to 1700

        if the price is equal to -1
        Print "Enter valid inputs"
        price is equal to -5

     */


//    this variable is write only , because there is just setMethod
    private int roomCount;

//    this variable is write only , because there is just setMethod
    private boolean isBalconyAvailable;

//    this variable is read only , because there is just getMethod
    private int price;

    public void setRoomCount(int roomCount){

        if(roomCount == 0 || roomCount == 1){
            this.roomCount = roomCount;
        }else{
            System.out.println("Room count is not valid");
            this.roomCount = -1;

        }


    }

    public void setBalconyAvailable(boolean isBalconyAvailable){

            this.isBalconyAvailable = isBalconyAvailable;

    }

    public int getPrice(){
        if(roomCount==0 && !isBalconyAvailable){
            price = 1000;
        }else if(roomCount==0 && isBalconyAvailable){
            price = 1200;
        }else if(roomCount==1 && !isBalconyAvailable){
            price = 1500;
        }else if(roomCount==1 && isBalconyAvailable){
            price = 1700;
        }else{
            System.out.println("Enter valid inputs");
            price = -5;
        }
        return price;
    }


}
