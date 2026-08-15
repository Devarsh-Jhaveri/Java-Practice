import java.util.*;
public class DigitExtractor {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your no.");
        int num=Integer.parseInt(scn.nextLine());
        int rev=0;
        while(num>=1){
            int digit=num%10;
            num=num/10;
            rev=rev*10+digit;       
        }
        while(rev>=1){
            int digit1=rev%10;
            rev=rev/10;
            System.out.println(digit1);
        }
    }
}

