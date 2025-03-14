class Parent
{
    void get()
    {
        System.out.println("Hinata Hyuga");
    }

}
class Child extends Parent
{
    void display()
    {
        get();
    }

}

public class Simple
{
    public static void main(String args[])
    {
        Child obj=new Child();
        obj.display();
    }
    
}