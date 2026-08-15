import java.util.*;
class Main LcmAndHcfCalculator  {
    public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("enter first no.");
    int n1=Integer.parseInt(scn.nextLine());
    System.out.println("enter second no.");
    int n2=Integer.parseInt(scn.nextLine());
    int hcf=1, min=Math.min(n1,n2);
    for(int i=min; i>=1; i--){
        if(n1%i==0 && n2%i==0){
            hcf=i;
            break;
        }
    }
    int lcm=(n1*n2)/hcf;
    System.out.println("the hcf is "+hcf);
    System.out.println("the lcm is "+lcm);
    
 }   
}
