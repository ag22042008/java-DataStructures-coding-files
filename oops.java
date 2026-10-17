class Person{
    String name;
    String email;
    void saydetails(){
        System.out.println("Hello myname is:"+ name+" my emAIL IS:"+email);
    }
    //default constructor
    // Person(){

    // }
    //parameterized constructor
    Person(String n,String e){
       name=n;
       email=e;
    }
     Person(String n){
       name=n;
       
    }
}


public class oops{
    public static void main(String[] args) {
        Person p1=new Person("kunal","harry@jvm.nic.in"); //p1 is reference variable
        System.out.println(p1);
        Person p4=new Person("harry");
        p4.saydetails();
        System.out.println(p1.name);
        System.out.println(p1.email);
        p1.saydetails();
    }
}