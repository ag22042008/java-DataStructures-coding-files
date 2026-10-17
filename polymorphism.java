class Vechicle{
    int seatingcapacity=2;
    public int noofengines(){
        return 2;
    }
    public void move(){
        System.out.println("Vechile is moving");
    }

}
class car extends Vechicle{
   int seatingcapacity=4;
   @Override // run time polymorphism
   public void move(){
     System.out.println("car is moving");
   }
    public int noofengines(){
        return 1;
    }
    public void Carname(){
        System.out.println("car name is "+"suzuki");
    }
     public void Carname(String name){
        System.out.println("car name is "+name);
    }
      public void Carname(String name,boolean costly){
        System.out.println("car name is "+name+" it is costly -> "+costly);
    }

}

class polymorphism{

    public static void main(String[] args) {
        Vechicle s=new car();
        System.out.println(s.seatingcapacity); // only refrence decides for variables 
        s.move();// object decides which method to call run time polymorphism
      System.out.println(s.noofengines());
      car k=new car();
      k.Carname("mg hector",true);//overloading compile time polymorphism

    }
}