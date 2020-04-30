package Sema.javaClass;
//Java Program to demonstrate the working of banking system
//where we deposit and withdraw amount from our account
//Creating an account class which has deposit() and withdraw() methods
class Account{
    int acc_no;
    String name;
    float amount;
    //Method to initialize object
    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    //deposit method
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+"deposited");
    }
    //withdraw method
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("insufficient balance");
        }else
            amount=amount-amt;
        System.out.println(amt+"withdrawn");
    }

    //method to check the balance of the account
    void checkBalance(){
        System.out.println("Balance:"+amount);
    }
    //method to display the values of an object
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}
//creating a test class to deposit and withdraw amount
public class TestAccount {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.insert(837377,"Sema",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(2000);
        a1.checkBalance();
        a1.withdraw(1500);
        a1.checkBalance();

    }


}
