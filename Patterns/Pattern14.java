import java.util.*;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=Integer.parseInt(scn.nextLine());
        int a=1;
        for(int i=1;i<=10;i++){
            int val=a*x;
            System.out.println(x+"*"+a+"="+val);
            a++;

        }
    }
}
