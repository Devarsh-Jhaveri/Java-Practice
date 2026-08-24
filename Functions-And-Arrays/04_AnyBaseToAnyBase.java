import java.util.*;
class AnyBaseToAnyBase {
    public static int AnyBase(int n, int b1, int b2){
        int dec=0, p=1, val=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            dec+=digit*p;
            p=p*b1;
        }
        p=1;
        while(dec>0){
            int digit=dec%b2;
            dec=dec/b2;
            val+=digit*p;
            p=p*10;
        }

        return val;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine());
        int b1=Integer.parseInt(scn.nextLine());
        int b2=Integer.parseInt(scn.nextLine());
        int value=AnyBase(n,b1,b2);
        System.out.print(value);
    }
}
