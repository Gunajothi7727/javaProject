import java.util.*;
public class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        int sum=0;
        while(i<n)
        {
            System.out.println("Enter the number:");
            a[i]=sc.nextInt();
            i=i+1;
            
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
            i=i+1;
        }
       System.out.println("Addition:"+(sum));
          
            
        
    }}

