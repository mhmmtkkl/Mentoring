package Ali.officeHour.EncapsulationPart2.Task;

/*

        Create an enum locations
            This enum has 5 data each one of them has tax amount.
            NEWYORK 30
            NEWJERSEY 28
            OHIO 25
            ATLANTA 20
            PITTSBURGH 10

            Return the tax amount.
            NOTE: Tax amount should be int

 */

enum LOCATIONS {
    /*
         Enum is like an array but you are not able to update it.
     */
    NEWYORK(30) , NEWJERSEY(28) , OHIO(25) , ATLANTA(20) , PITTSBUGH(10);

    private int tax;

    LOCATIONS(int tax){
        this.tax = tax;
    }

    public int getTax(){
        return tax;
    }

}
