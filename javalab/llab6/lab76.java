class Animal{
    void makeSound(){
        System.out.println("Animal makes sounds.");
    }
}
class cat extends Animal{
    void makeSound(){
        System.out.println("cat makes meow sound");
    }
}
public class lab76 {
    public static void main(String args[]){
        cat c=new cat();
        c.makeSound();
    }
    
}
