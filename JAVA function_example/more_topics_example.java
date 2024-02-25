public class more_topics_example {
    public static void main(String[] args) {
         aircraft ar=new aircraft("Boeing 747-200");
         
    }
}
class aircraft{
    String model;
        aircraft(String i){
            model=i;
            boeing be=new boeing();
            be.type();
        }
    private class boeing {
            public void type(){
                System.out.println("The Model is "+model);
            }
        }
}

 class Program {
    enum Rank {
        SOLDIER,
        SERGEANT,
        CAPTAIN
    }
    public static void main(String[] args) {
        Rank a = Rank.SERGEANT;
                
        switch(a) {
            case SOLDIER:
                System.out.println("Soldier says hi!");
                break;
            case SERGEANT:
                System.out.println("Sergeant says Hello!");
                break;
            case CAPTAIN:
                System.out.println("Captain says Welcome!");
                break;
        }
    }
}

