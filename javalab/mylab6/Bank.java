package mylab6;
class bankAccount{
    private String accountNumber;
    private double balance;

    public bankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("balance after deposit : "+balance);
    }
    public void withdrawl(int amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("balance after withdrawl : "+balance);
        }
        else{
            System.out.println("insufficient balance : "+balance);
        }
    }
}
class savingsaccount extends bankAccount{

    
    
}
public class Bank {
    
}

