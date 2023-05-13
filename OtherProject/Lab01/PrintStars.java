package OtherProject.Lab01;

import java.util.*;  
public class PrintStars {
   static void printstars(int n){
    int m;  
    m=n;  
    for(int i=1;i<=n;i++)  
    {  
       for(int j=1;j<=m-1;j++)  
       {  
        System.out.print(" ");  
       }  
       for(int k=1;k<=2*i-1;k++)  
       {  
        System.out.print("*");  
       }  
       m--;  
     
       System.out.print("\n");  
    }  
    }
    public static void main(String[] args){  
        Scanner sc= new Scanner(System.in);    
        System.out.print("Enter height: ");  
        int a = sc.nextInt(); 
        sc.close();
        printstars(a);
    }  
}
