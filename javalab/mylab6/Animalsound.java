package mylab6;
class Animal{
    void makeSound(){
        System.out.println("all animals make sounds.");
    }
}
class cat extends Animal{
    void makeSound(){
        System.out.println("cats sound like meow meow.");
    }
}
public class Animalsound {
    public static void main(String[] args){
        cat c=new cat();
        c.makeSound();
        Animal a=new Animal();
        a.makeSound();
    }
}
