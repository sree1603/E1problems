abstract class Bank{
    double initial;
    double min=500.00;
    Bank(double a){
        this.initial=a;
    }
    public   abstract void rate();//abstract method

    void deposit(double ab){
        initial += ab;
        System.out.println("Your are deposited "+ab+"\nThank You");
    }

    void withdraw(double ab){
        if(initial>=min){
            System.out.println("Your "+ab+" is successfully withdrawn");
        }
        else{
            System.out.println("insufficient funds");
        }
    }

    void balance(){
        System.out.println("Your balance amount is:"+initial);
    }

    void loan(double a){
        initial +=a;
        System.out.println("Your loan is sanctioned successfully");
        }
    }

    class ICIC extends Bank{
        ICIC(double a){
            super(a);
        }
        public void rate(){
            System.out.println("our ICIC bank offers 5.32% interest");
        }
    }

    class IBI extends Bank{
        IBI(double a){
            super(a);
        }
        public void rate(){
            System.out.println("our IBI bank offers 4.56% interest");
        }

    }
    public class exc6{
        public static void main(String args[]){
              Bank IBIBank = new IBI(1000.00);
        IBIBank.deposit(500);
        IBIBank.withdraw(700);
        IBIBank.balance();
        IBIBank.rate();
        
        System.out.println();

        // Create an instance of ICIC bank with an initial balance
        Bank ICICBank = new ICIC(1500.00);
        ICICBank.deposit(300);
        ICICBank.withdraw(1300);
        ICICBank.balance();
        ICICBank.rate();
        }
    }

