class livingThing{
    protected String size;
    protected int integer;
    public void eat() {
        System.out.println("Animal eats");
    }
     public int  rub(){
            integer=2;
            return ++integer;
    }
}
class dog extends livingThing {
   //public int integer;
    dog(){
         size="medium";
    }
    public int rub(){
        integer=7;
        ++integer;
        return integer;
    }
}

public class inheritence_example {
    public static void main(String[] args) {
        System.out.println("null");
        dog Dog = new dog();
        Dog.eat();
        String str=Dog.size;
        System.out.println(str);
        System.out.println(Dog.rub());
    }
}

