class CallByValue {  
 int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the local variable only  
 }  
     
 public static void main(String args[]){  
   CallByValue op=new CallByValue();  
  
   System.out.println("Before change "+op.data);  
   op.change(5);  
   System.out.println("After change "+op.data);  
  
 }  
}  