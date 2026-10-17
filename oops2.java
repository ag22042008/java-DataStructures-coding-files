class Person{
    String name;
    String email;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
     Person(String name,int age,String email){
       this(name, age);//constructor chaining // upar ke constructor ko call krega and parameters is wle constructor me hone chaiye which is to be passed in upper constructor
       this.email=email;
    }
    Person(Person p){ //copy constructor
        this.name=p.name;
        this.email=p.email;
        this.age=p.age;
    }
     void saydetails(){
        System.out.println("Hello my name is: "+ name+" my age is :"+age+" my email is:"+email);
    }
}

public class oops2 {
    public static void main(String[] args) {
        Person p1 = new Person("Rahul", 35,"rahul@gmail.com");
        Person p2=new Person(p1);
        p2.saydetails();
        p1.saydetails();
        // Integer s=new  Integer(10);//boxing
        // System.out.println(s.toString());
    }
}
