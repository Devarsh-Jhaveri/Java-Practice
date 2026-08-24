import java.util.*;
class DecimalToAnyBase {
    public static int AnyBase(int n, int b){
        int rev=0, p=1;
        while(n>0){
            int digit=n%b;
            n=n/b;    
            rev+=digit*p;
            p=p*10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine());
        int b=Integer.parseInt(scn.nextLine());
        int val=AnyBase(n,b);
        System.out.print(val);
    }
}
