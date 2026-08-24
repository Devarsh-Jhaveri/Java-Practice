import java.util.*;
class AnyBaseAddition {
    public static int AnyBase(int n1, int n2, int b){
        int rev=0, carry=0, p=1;
        while(n1>0 || n2>0 || carry>0){
            int d1=n1%10;
            int d2=n2%10;
            n1=n1/10; 
            n2=n2/10;
            int sum=carry+d1+d2;
            carry=sum/b;
            sum=sum%b;
            rev+=sum*p;
            p=p*10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=Integer.parseInt(scn.nextLine());
        int n2=Integer.parseInt(scn.nextLine());
        int b=Integer.parseInt(scn.nextLine());
        int val=AnyBase(n1, n2, b);
        System.out.print(val);
    }
}
