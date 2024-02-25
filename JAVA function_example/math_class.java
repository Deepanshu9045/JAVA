class math{
    static int cb(int x){
        int var=x*x*x;
        return var;
    }
}
public class math_class {
    static void print(int intt){
        System.out.println(intt);
    }
    public static void main(String[] args) {
        float var =16.65f;
        System.out.println(Math.ceil(var));
        System.out.println(Math.abs(-7));
        System.out.println(Math.floor(var));
        System.out.println(Math.max(12,56));
        System.out.println("...........");
        System.out.println(Math.min(12,-6));
        System.out.println(Math.pow(2,5));
        System.out.println(Math.random());
        System.out.println(Math.toDegrees(10));
        System.out.println(Math.sin(45));
        //System.out.println(1/Math.pow(2,(1/2)));
        System.out.println(Math.tan(45));
        System.out.println(Math.cos(0)); 
        System.out.println(Math.sqrt(144)); 
        System.out.println(math.cb(3));
    }
}
