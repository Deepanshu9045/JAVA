public class anonymous_classes {
  public static void main(String[] args) {
    building b = new building() {
      @override
      public void disp() {
        System.out.println("Building JAVA.....");
      }
    };
    building b2 = new building();
    b2.disp();
    b.disp();

  }
}

class building {
  public void disp() {
    System.out.println("Building JAVSCRIPT......");
  }
}
