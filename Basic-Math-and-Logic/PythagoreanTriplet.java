
import java.util.*;
public class PythagoreanTriplet{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int a=Integer.parseInt(scn.nextLine());
        System.out.println("Enter 2nd no.");
        int b=Integer.parseInt(scn.nextLine());
        System.out.println("Enter 3rd no.");
        int c=Integer.parseInt(scn.nextLine());
        
        int max=a;
        if (b>=max){max=b;}
        if (c>=max){max=c;}
        boolean triplet=false;
        if(a==max){
            triplet=(b*b+c*c==a*a);
        }
        if(b==max){
            triplet=(b*b==c*c+a*a);
        }
        if(c==max){
            triplet=(b*b+a*a==c*c);
        }
        System.out.println(triplet);
    }
}
