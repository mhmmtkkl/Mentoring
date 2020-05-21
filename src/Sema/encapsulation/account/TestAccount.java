package Sema.encapsulation.account;

public class TestAccount {
    public static void main(String[] args) {
        //creating instance of Account class
        Account account=new Account();
        //setting values through setter methods
        account.setAcc_no(7894934505L);
        account.setName("John John");
        account.setEmail("john@john.com");
        account.setAmount(500000f);
        //getting values through getter methods
        System.out.println(account.getAcc_no()+" "+account.getName()+" "+account.getEmail()+" "+account.getAmount());
    }
}
