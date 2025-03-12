public class Return
{
    public int Integer(int num)
    {
    return num;
    }
    public static void main(String args[])
    {
        Return obj=new Return();
        int a=obj.Integer(17);
        System.out.println(a);
    }
}