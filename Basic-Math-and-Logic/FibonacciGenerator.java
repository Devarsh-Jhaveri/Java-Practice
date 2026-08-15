import java.util.*;
public class FibonacciGenerator {
    public static void main(String[] args){
        
        //Print N fibonacci numbers
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter no.");
        int n=Integer.parseInt(scn.nextLine());
        int a=0, b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=3; i<=n; i++){
            int c = a+b;
            System.out.println(c);
            a=b; b=c;
        }
    }
}
