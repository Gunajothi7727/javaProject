class Parent
{
    void get()
    {
        System.out.println("Sasuke Uchiha");
    }
}
class Child extends Parent
{
    void display()
    {
        get();
    }
}
class Child2 extends Child{
    void print()
    {
        display();
    }
}
public class Multilevel
{
    public static void main(String args[])
    {
        Child2 onj=new Child2();
        onj.print();
    }
}