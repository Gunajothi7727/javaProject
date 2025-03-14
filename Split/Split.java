public class Split
{
    public static void main(String args[])
    {
        String name="Nagato,Konan,Yahikoo";
        String akasuki[]=name.split(",");
        System.out.println(akasuki[0]);
        System.out.println(akasuki[1]);
        System.out.println(akasuki[2]);
    }
}