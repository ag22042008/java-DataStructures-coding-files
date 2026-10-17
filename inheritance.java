class Animal{
    int legs;
    int eyes;
    Animal(){
        System.out.println("Animal class constructor is called");
    }
    Animal(int legs){
        this.legs = legs;
        System.out.println("No of legs is "+legs);
    }
    void walk(){
        System.out.println("I am Walking");
    }
}
class camel extends Animal{
    int humps;
    void storewater(){
        System.out.println("I can store water");
    }
    camel(){
        super(4);
        System.out.println(super.legs);
    
        System.out.println("camel class constructor is called");
    }
}


class inheritance{
    public static void main(String[] args) {
        camel c=new camel();
        // //inherited from parent class
        // c.eyes=2;
        // c.legs=4;
        // c.walk();
        // c.storewater();
        // System.out.println(c.legs);
    }
}