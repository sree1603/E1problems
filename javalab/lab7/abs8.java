abstract class Telephone {
    public abstract void call(String number);
    public abstract void lift();
    public abstract void disconnected();
}

class SmartTelephone extends Telephone {
   
    public void call(String number) {
        System.out.println("Calling " + number + " using smart telephone...");
    }

   
    public void lift() {
        System.out.println("Lifting smart telephone handset...");
    }

   
    public void disconnected() {
        System.out.println("Smart telephone call disconnected.");
    }
}

public class abs8 {
    public static void main(String[] args) {
        Telephone phone = new SmartTelephone();
        phone.lift(); 
        phone.call("123-456-7890"); 
        phone.disconnected();  
    }
}
