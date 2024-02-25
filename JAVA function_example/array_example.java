public class array_example {
    public static void main(String[] args) {
        //Array decleration 
        // for ex int[]var_name;
        int[]var_name = new int[5];
        var_name[0]=12;
        var_name[1]=16;
        System.out.println(var_name[1]);

        //Another way of assigning value
        int[]val={1,56,89,90};
        System.out.println(val[3]);

        //Length  property
        System.out.println(val.length);

        //Using for loop to output all values
        for(int x=0;x<val.length;x++) System.out.println(val[x]);

        //Addition of all value in array
        int sum=0;
        for(int z=0;z<val.length;z++) {sum+=val[z];} System.out.println(sum);

        //For each loop
        for(int a: val) System.out.println(a);
        
        //Multidimensional array
        int[][]sample={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sample[0][2]);

        //Printing Whole value in the array
        for(int x=0; x<sample.length; x++){
         for(int y=0; y<sample[x].length; y++){ 
            System.out.print(sample[x][y]+ " ");
            }
          System.out.println(); 
        }
    }
}
