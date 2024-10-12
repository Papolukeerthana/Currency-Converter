import java.util.*;

import javax.print.DocFlavor.STRING;
class currency_converter
{
    public static void main(String[] args)
     {  Scanner sc=new Scanner(System.in);
        System.out.println("write amount in USD:");
        double amount=sc.nextDouble();
        System.out.println("Enter Target Currency(EUR,GBP,INR)");
        String currency=sc.next().toUpperCase();
        double conversionrate;
        switch(currency)
        {
            case "EUR":
                conversionrate=0.93;
                break;
            case "GBP":
                conversionrate=0.78;
                break;
             case "INR":
                conversionrate=83.73;
                break;
                default:
                conversionrate=1.0;
                System.out.println("Invalid currency");
                return;
        }
        double convertedamount =amount*conversionrate; 
        System.out.println("converted amount:"+convertedamount);

        
    }
}
