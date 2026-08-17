import java.util.*;
public class Pattern1{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your no.");
        int num=Integer.parseInt(scn.nextLine().trim());
        for (int i=1; i<=num; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
        System.out.println("");
        }
    }
}
