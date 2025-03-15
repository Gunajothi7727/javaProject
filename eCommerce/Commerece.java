import java.util.*;
public class Commerece{
    public void calculateTotalPrice(int prices, boolean isPremiumMember){
if(isPremiumMember)
{
double finalprice=prices-prices*0.05;
System.out.println(finalprice);
}
if(prices>=5000){
    double finalprice2=prices-prices*0.1;
    System.out.println(finalprice2);
}
}
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            while(true){
            System.out.println("Price:");
            int price=sc.nextInt();
            boolean isPremiumMember=true;
            Commerece obj=new Commerece ();
            obj.calculateTotalPrice(price,isPremiumMember);
            
        }

    }
    }