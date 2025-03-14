class Parent{
    void get()
    {
        System.out.println("Naruto Uzumaki");

    }
}
class Child extends Parent{
    void get()
    {
        System.out.println("Hinata Hyuga");
    }
}
public class Overriding
{
    public static void main(String args[])
    {
        Child obj=new Child();
        obj.get();
    }
}