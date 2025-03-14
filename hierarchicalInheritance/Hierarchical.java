class Parent
{
    void get()
    {
        System.out.println("Minato");
    }
}
class Child1 extends Parent
{
    void display()
    {
        get();
    }
}
class Child2 extends Parent
{
    
        void print()
        {
            get();
        }
    

}
public class Hierarchical
{
    public static void main(String args[])
    {
        Child1 obj=new Child1();
        obj.display();
 
        Child2 onj=new Child2();
        onj.print();
        
    }
}