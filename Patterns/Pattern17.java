
import java.util.*;
public class Pattern17{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int st=1;
        int n=Integer.parseInt(scn.nextLine());
        
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n/2;j++){
                if(i==(n/2+1)){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            for(int j=1;j<=st;j++){
                System.out.print("*\t");
            }
            if(i<=(n/2)){
                st++;
            }
            else{
                st--;
            } 
            System.out.println("");
        }
    }
}
