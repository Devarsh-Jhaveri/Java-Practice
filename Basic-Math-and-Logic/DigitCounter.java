import java.util.*;
public class DigitCounter {
     public static void main(String[] args) {
        //NUMBER DIGIT COUNTER:
        Scanner scn=new Scanner(System.in);
        System.out.println("Please enter your no.");
        int n=Integer.parseInt(scn.nextLine());
        int count =0;
        if (n<0){
            n=n*(-1);
        }    
        if (n==0){
            count=1;
        }
        else{
            while(n>=1){
                count++;
                n=n/10;
            }
        }
        System.out.println("Your number has "+count+" digits.");
        }
}
