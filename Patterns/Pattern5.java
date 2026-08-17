
import java.util.*;
public class Pattern5{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=Integer.parseInt(scn.nextLine().trim());
        int sp=n/2, st=1;
        for (int i=1; i<=n; i++){
            // MAKING THE UPPER HALF
            for(int j=1;j<=sp;j++){
                System.out.print("\t");        
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");        
            }
            System.out.println("");
            if(i<=n/2){
                sp--;
                st+=2;
            }
            else{
                sp++;
                st-=2;
            }
        } 
    }
}
