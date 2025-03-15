import java.util.*;
public class Salary{
      public static void main(String args[])
    {
        System.out.println("1.Developer\n2.Manager");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Profession");
         int i=sc.nextInt();
         System.out.println("Enter the Salary:");
        int salary=sc.nextInt();
        if(i==1)
        {
            double Percent=salary*0.1;
            double Salary1=salary+Percent;
            System.out.println(Salary1);

        }
        else if(i==2)
        {
            double Percent2=salary*0.2;
            double Salary2=salary+Percent2;
            System.out.println(Salary2);
        }
    }
}
