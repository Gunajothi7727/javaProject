public class Calculator
{
    public int Add(int add1,int add2)
    {
    int Add=add1+add2;
    return Add;
    }
    public int Subtract(int sub1,int sub2)
    {
        int Sub=sub1-sub2;
        return Sub;
    }
    public int Multiply(int mul1,int mul2)
    {
        int Multi=mul1*mul2;
        return Multi;
    }
    public int Divide(int div1,int div2)
    {
        int Div=div1/div2;
        return Div;
    }
    public static void main(String args[])
    {
        Calculator onj=new Calculator();
        int x=onj.Add(10,17);
        int y=onj.Subtract(67,56);
        int z=onj.Multiply(56,8);
        int w=onj.Divide(70,10);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }
}