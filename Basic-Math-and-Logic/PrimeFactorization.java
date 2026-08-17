
import java.util.*;
public class PrimeFactorization{
    public static void main(String[] args) {
        System.out.printf("Please enter your no.");
        Scanner scn=new Scanner(System.in);
        int num=Integer.parseInt(scn.nextLine());
        for(int i=2;i*i<=num;i++){
            while(num%i==0){
                System.out.println(i);
                num=num/i;
            }
        }
        if (num!=1){
            System.out.println(num);
        }
    }
}
