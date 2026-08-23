import java.util.*;
public class Pattern20{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=Integer.parseInt(scn.nextLine().trim());
        for (int i=1; i<=n; i++){
            if(i<=n/2 || i==n){
                for (int j=1;j<=n;j++){
                    if(j==1 || j==n){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
            }
            else{
                for(int j=1; j<=n; j++){
                    if(j==1 || j==n || i+j==n+1 || i==j ){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println("");
        }
    }
}
