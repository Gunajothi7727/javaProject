import java.util.*;
class  Employee
{
    int calculateSalary()
    {
        Scanner sc=new Scanner(System.in);
        
        
        
        System.out.println("Enter the Salary:");
        int baseSalary=sc.nextInt();
        return baseSalary;
       
        
    }
}
class Manager extends Employee
{
    void Man()
    {
         int baseSalary= calculateSalary();
         double percent=baseSalary*0.2;
         double salary=percent+baseSalary;
         System.out.println("Salary"+salary);
         
    }
}
class Developer extends Employee
{
    void  Dev()
    {
        int baseSalary= calculateSalary();;
        double percent2=baseSalary*0.1;
        double salary2=percent2+baseSalary;
         System.out.println("Salary"+salary2);

       
    }
}

public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        int i=1;
        while(true){
        System.out.println("1.Manager\n 2.Developer");
        System.out.println("Enter the Profession:");
        i=sc.nextInt();
        
        if(i==1){
        Manager man=new Manager();
        man.Man();
        }
        else if(i==2)
        {
        Developer dev=new Developer();
        dev.Dev();
        }
        i=i+1;
        }
    }
}
