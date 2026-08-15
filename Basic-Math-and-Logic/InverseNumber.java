import java.util.Scanner;

public class InverseNumber {
    
//Q) INVERSE OF A NO.
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=Integer.parseInt(scn.nextLine());
        int i=1, rev=0;
        while(n>=1){
            int digit=n%10;
            n=n/10;
            rev=rev+i*(int)Math.pow(10, digit-1);
            i++;
        }
        System.out.println("Inverse of your no. is "+rev);
    }
}
