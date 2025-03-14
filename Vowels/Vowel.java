import java.util.*;
public class Vowel
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the alphabet");
        String e=sc.nextLine();
        int i=0;
        int detect=0;
        String a[]={"a","e","i","o","u"};
        {
            while(i<=4)
            {
                if(e.equals(a[i]))
                {
                    detect=1;
                }
            i=i+1;
            }
        if(detect==1)
        {
            System.out.println("Its  a Vowel");
        }
        else
        {
            System.out.println("Its not a Vowel");
        }

    }
}}