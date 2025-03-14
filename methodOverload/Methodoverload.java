public class Methodoverload
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition1:"+c);
    }
    public void add(int a, int b,int c)
    {
        int d=a+b+c;
        System.out.println("Addition2:"+d);
    }
    public static void main(String args[])
    {
        Methodoverload plus=new Methodoverload();
        plus.add(10,17);
        plus.add(12,3,4);

    }
}