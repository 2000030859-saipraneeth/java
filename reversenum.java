import java.util.*;
import java.lang.*;
import java.io.*;

 class sample{

  public static void main (String[] args) throws java.lang.Exception{
 try{ 
        Scanner sc = new Scanner(System.in);
       int reversed=0;
   int a=sc.nextInt();
  
  while(a!=0) {
	  int ok=a%10;
	  reversed=reversed*10+ok;
	  a=a/10;
  }
  System.out.print(reversed);
 
    }catch(Exception e){
         return;
     }
     
        
         
     }
     
     
  }
