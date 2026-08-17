
import java.util.*;
public class Pattern4{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your no.");
        int num=Integer.parseInt(scn.nextLine().trim());
        for (int i=num; i>=1; i--){
            for(int k=num-i;k>=1;k--){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
        System.out.println("");
        }
    }
}
