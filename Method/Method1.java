public class Method1
{
    public void Add(int num1,int num2)
    {
        int num3=num1+num2;
        System.out.println(num3);
    }
    public static void main(String args[])
    {
        Method1 obj=new Method1();
        obj.Add(10,17);
    }
}