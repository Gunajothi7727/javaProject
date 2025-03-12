 public class Example
{
    public void Name(String name1,String name2)
    {
        String name=name1+name2;
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Example obj=new Example();
        obj.Name("Naruto","Uzumaki");
    }
}