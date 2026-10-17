class customer{
    String name;
    int age;
    String gender;
    static  String nationality="ind";
    customer(String name,int age ,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    static String companyname(){
        return "Amazon";
    }
    void hello(){
        System.out.println("Hi my name is "+ this.name+" my company name is "+companyname());
    }
}
class cars{
    String name;
    static int noofcars;
    cars(String name){
        this.name=name;
        noofcars++;
    }
}
public class statickeyword {
    public static void main(String[] args) {
        // customer c1=new customer("kohli",36,"male");
        //  customer c2=new customer("rohit",39,"male");
        //  System.out.println(c1.age);
        //  System.out.println(c2.age);
        //  // bad practice to ascess in this way it should be through class way System.out.println(c1.nationality);
        //  System.out.println(customer.nationality);
        //  customer.nationality="aus";
        //  System.out.println(customer.nationality);
        customer c22=new customer("aditya", 21, "male");
        c22.hello();
        System.out.println(customer.companyname());
        System.out.println(cars.noofcars);
        cars s=new cars("Suzuki");
        System.out.println(cars.noofcars );// modification of static variable
        
    }
}
