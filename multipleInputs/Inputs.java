
import java.util.*;
public class Inputs
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i=0;
        while(i<n)
        {
            System.out.println("Enter the value:");
            a[i]=sc.nextInt();
            i=i+1;
        }
        while(i<n)
        {
            System.out.println("Entered value:"+a[i]);
            i=i+1;

        }


    }
}