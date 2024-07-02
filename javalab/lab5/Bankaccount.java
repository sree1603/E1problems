import java.util.Scanner;

class encapsulation{
    private String accountnum;
    private String bankbalance;
    public String getAccountnum() {
        return accountnum;
    }
    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum;
    }
    public String getBankbalance() {
        return bankbalance;
    }
    public void setBankbalance(String bankbalance) {
        this.bankbalance = bankbalance;
    }
}
public class Bankaccount {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        encapsulation e=new encapsulation();
        String a;
        String b;
        System.out.print("enter your bank account : ");
        a=s.nextLine();
        System.out.print("your bank balance : ");
        b=s.nextLine();
        e.setAccountnum(a);
        e.setBankbalance(b);
        System.out.println(e.getAccountnum());
        System.out.println(e.getBankbalance());
        s.close();
    }
}
