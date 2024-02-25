public class Constructor_Example {
    int x;
    String y;
    String z;
    //Without parameter
    Constructor_Example(){
        x=4;
    }
    //With parameter
    Constructor_Example(int x){
      this.x=x;
    }
    //Another type
    Constructor_Example(String iy){
        z=iy;
    }
}
class Main {
    public static void main(String[] args) {
        Constructor_Example obj1 = new Constructor_Example();
        System.out.println(obj1.x);
        Constructor_Example obj2= new Constructor_Example(12);
        System.out.println(obj2.x);
        Constructor_Example obj3 = new Constructor_Example("Blue");
        System.out.println(obj3.z);
        
    }
}
