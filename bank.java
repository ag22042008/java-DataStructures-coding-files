public interface bank{
    double getrateofinterest();
    void printName(String Name);
}
abstract class bank2{
    public abstract  int bankid();
    public void bankname(){
      System.out.println("Bank name"+"rbi");
    }
}
class sbi extends bank2 implements bank{
    String  Name;
    public int  bankid(){
      return 9;
    }
    public double getrateofinterest(){
        return 6.7;
    }
    public void printName(String Name){
        this.Name=Name;
    }
    public void bankname(){ 
        System.out.println("Bankname "+"sbi");
    }

}

class abstraction{
    public static void main(String[] args) {
        sbi person1=new sbi();
        person1.Name="hARRY";
        System.out.println(person1.Name);
        System.out.println(person1.getrateofinterest());// complete abstraction by interfrace
        person1.bankname();//PARTIAL ABSTRACTION BY ABSTRACT CLASS
       System.out.println("END");

    }
}