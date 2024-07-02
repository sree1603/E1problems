import java.util.*;
class Person{
    private String name;
    private int age;
    private String country;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }  
}
public class Person1{
    public static void main(String[] args){
        Person p=new Person();
        Scanner s=new Scanner(System.in);
        int a;
        String n;
        String 
        c;
        System.out.print("enter name : ");
        n=s.nextLine();
        System.out.print("enter age : ");
        a=s.nextInt();
        s.nextLine();
        System.out.print("enter country : ");
        c=s.nextLine();
        p.setAge(a);
        p.setName(n);
        p.setCountry(c);
        System.out.println(p.getAge());
        System.out.println(p.getName());
        System.out.println(p.getCountry());
        s.close();
    }
}