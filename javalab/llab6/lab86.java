class BankAccount{
    double Amount;
    BankAccount(double Amount){
        this.Amount=Amount;
    }
    void Deposite(double val){
        Amount+=val;
        System.out.printf("your money is deposited Successfull your present balance is %.4f \n",Amount);

    }
    void withdraw(double val){
        Amount-=val;
        System.out.printf("your money  withdrawal is completed your present balance is %.4f \n",Amount);

    }
}
class savings extends BankAccount{
    savings(double val){
        super(val);
    }
    void withdraw(double val){
        if((Amount-val) >=100){
            super.withdraw(val);
        }
        else{
            System.out.println("we can't withdraw  as you don't have minimum balance.");
        }
    }

}
public class lab86 {
    public static void main(String args[]){
        savings o=new savings(500.00);
        o.Deposite(50);
        o.withdraw(450);
    }
    
}
