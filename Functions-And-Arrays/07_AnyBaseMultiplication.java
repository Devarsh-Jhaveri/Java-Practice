import java.util.*;
class AnyBaseMultiplication {
    public static int getSum(int ans, int rev, int b){
        int value=0, carry=0, p=1;
        while(rev>0 || ans>0 || carry>0){
            int d1=rev%10;
            int d2=ans%10;
            rev=rev/10; 
            ans=ans/10;
            int sum=carry+d1+d2;
            carry=sum/b;
            sum=sum%b;
            value+=sum*p;
            p=p*10;
        }
        return value;
    }

    public static int getProd(int n1,int n2,int b){
        int carry=0, ans=0, i=1;
        while(n1>0){
            int rev=0;
            int d1=n1%10;
            n1=n1/10;
            int a=n2;
            int p=i;
            while(a>0 || carry>0){
                int d2=a%10;
                a=a/10;
                int mul=d1*d2+carry;
                carry=mul/b;
                mul=mul%b;
                rev+=mul*p;
                p=p*10;
            }
            i=i*10;
            ans=getSum(ans, rev, b);
        } 
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n1=Integer.parseInt(scn.nextLine());
        int n2=Integer.parseInt(scn.nextLine());
        int b=Integer.parseInt(scn.nextLine());
        int val=getProd(n1, n2, b);
        System.out.print(val);
    }
}
