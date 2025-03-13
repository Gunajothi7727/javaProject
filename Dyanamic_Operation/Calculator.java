import java.util.*;
public class Calculator{
      public static void main(String args[])
    {
        System.out.println("1.Addition\n 2.Subtraction\n 3.Multiplication\n4.Division");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the operation");
         int i=sc.nextInt();
        System.out.println("Enter the first Number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        if(i==1)
        {
            
            System.out.println(a+b);
        }
        else if(i==2)
        {
            System.out.println(a-b);
        }
        else if(i==3)
        {
            System.out.println(a*b);
        }
        else if(i==4)
        {
            System.out.println(a/b);
        }

        

    }
}