public class String2
{
    public String Concatenator(String name1,String name2)
    {
        String name=name1+" "+name2;
        return name;
    }
    public static void main(String args[])
    {
        String2 obj=new String2();
        String x=obj.Concatenator("Kakashi","Hatake");
        System.out.println(x);
    }
}