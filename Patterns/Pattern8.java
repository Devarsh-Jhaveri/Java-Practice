
import java.util.*;
public class Pattern8{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=Integer.parseInt(scn.nextLine().trim());
        for (int i=n;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print("\t");
            }
            System.out.println("*");
        }
    }
}
