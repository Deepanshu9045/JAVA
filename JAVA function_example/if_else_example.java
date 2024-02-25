public class if_else_example {
    public static void main(String[] args) {
    //Simple if else block
        int num=1;
        if (num>5 && num==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    //Nested if else block
        int num2=5;
        String val="S20+";
        if (num2>12){
            if(num2>20){
                if(num2<60){
                    if(val=="S20+"){
                        System.out.println("Nested loop Works");}
                    else{
                        System.out.println("Failed to reterive");
                    }
                    }
                }
            }
        else{
            System.out.println("None of the conditional value is satisfied");}
    //elif clause
        int age=20;
        if(age<12){
            System.out.println("Not eligible");
        }
        else if(age>=12 && age<16){
            System.out.println("GROUP D");
        }
        else if(age>16 && age<=20){
            System.out.println("GROUP C");
        }
        else if(age<=22){
            System.out.println("GROUP B");
        }
        else{
            System.out.println("GROUP A");
        }
    
    }



}
    

