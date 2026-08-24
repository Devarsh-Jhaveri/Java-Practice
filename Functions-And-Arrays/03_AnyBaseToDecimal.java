import java.util.*;
class AnyBaseToDecimal {
    public static int AnyBase(int n, int b){
        int dec=0, p=1;
        while(n>0){
            int digit=n%10;
            n=n/10;
            dec+=digit*p;
            p=p*b;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine());
        int b1=Integer.parseInt(scn.nextLine());
        int value=AnyBase(n,b1);
        System.out.print(value);
    }
}
