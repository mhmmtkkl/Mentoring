package Ali.aastudy.EncapsilationPart2;

enum LOCATIONS{
    NEWYORK(30) , NEWJERSEY(28) , OHIO(25) , ATLANTA(20) , PITTSBURGH(10);

    private int tax;

    LOCATIONS(int tax){
        this.tax= tax;
    }

    public int getTax(){
        return tax;
    }

}
