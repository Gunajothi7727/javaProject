import java.util.*;
public class Salary{
    
      public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(true)
        {
        System.out.println("1.Developer\n2.Manager");
        System.out.println("Enter the Salary:");
        int salary=sc.nextInt();
        System.out.println("Enter the Profession");
         i=sc.nextInt();
        
        if(i==1)
        {
            double Percent=salary*0.1;
            double Salary1=salary+Percent;
            System.out.println("salary"+Salary1);

        }
        else if(i==2)
        {
            double Percent2=salary*0.2;
            double Salary2=salary+Percent2;
            System.out.println("salary"+Salary2);
        }
        i=i+1;
        }
    }
}

