import java.util.*;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine());
        int sp=n/2, st=1, val=1;

        for(int i=1; i<=n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int cval=val;
            for(int j=1;j<=st;j++){
                System.out.print(cval+"\t");
                if(j<=st/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }
            if(i<=n/2){
                st+=2;
                sp--;
                val++;
            }
            else{
                sp++;
                st-=2;
                val--;
            }
            System.out.println("");
        }
    }
}
