import java.util.*;
class AnyBaseSubtraction {
    public static int AnyBase(int num1, int num2, int b){
        int rev=0, carry=0, p=1, sub=0, n1, n2;
        if(num1>num2){
            n1=num1;
            n2=num2;
        }
        else{
            n1=num2;
            n2=num1;
        }
        while(n1>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10; 
            n2=n2/10;
            d1=d1-carry;
            if(d1<d2){
                sub=d1+b-d2;
                carry=1;
            }
            else{
                sub=d1-d2;
                carry=0;
            }
            rev+=sub*p;
            p=p*10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=Integer.parseInt(scn.nextLine());
        int num2=Integer.parseInt(scn.nextLine());
        int b=Integer.parseInt(scn.nextLine());
        int val=AnyBase(num1, num2, b);
        System.out.print(val);
    }
}
