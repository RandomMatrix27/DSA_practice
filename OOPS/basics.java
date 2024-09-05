package OOPS;

public class basics {
    public static void main(String[] args) {
        Person p1 = new Person(24,"Sreyas");
        Person p2 = new Person(14,"Shank");

//        System.out.println(p1.age+" "+p1.Name);
//        p2.eat();
//        p1.walk(2);
//        System.out.println(Person.count);

        Developer d1 = new Developer(21,"karan");
        d1.walk();



    }
}

class Developer extends Person{
    public Developer(int age, String name) {
        super(age, name);
    }
}
class Person{
    String Name;
    int age;
    static int count;

//    public Person(){
//        count++;
//        System.out.println("Creating objects");
//    }
    public Person(int age,String name){
        this.Name=name;
        this.age=age;
    }

    void walk(){
        System.out.println(Name+ " is walking");
    }
    void eat(){
        System.out.println(Name+" is eating");
    }
    void walk(int steps){
        System.out.println(Name +" walked "+steps+" steps ");
    }
    void doWork(){
        System.out.println("Person is working");
    }
}
