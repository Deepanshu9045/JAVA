public class function_example {
  //Defining a function Without parameters
    static void hello(){
      System.out.println("Welcome This is a function method");
    }
  //Defining a function with parameters 
    static void parameter(String name,int age){
      System.out.println("Welcome, " + name +"! "+"and your age is "+age);
    }
  //Returning values from function
  static String ret(int num, String value){
     String val="Hello "+value+"!"+" your lottery number is "+num;
     return val;
  }
  //Factorial using function
  
  static int fact(int x){
    if( x==1 && x==0) return 1;
    else{
      int f=1;
      for(int y=1;y<=x;y++){
      f*=y; }
      return f;
    }
  }
    public static void main(String[] args) {
      //Without Returning
      //Calling method
      hello(); 
      parameter("Cobra",23);
      System.out.println(ret(12,"Rattle"));
      System.out.println(fact(5));
      
    }
}
    