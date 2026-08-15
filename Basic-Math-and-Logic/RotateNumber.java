import java.util.Scanner;
public class RotateNumber  {
 public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the no.");
    int num=Integer.parseInt(scn.nextLine());
    System.out.println("no. for reverse");
    int k=Integer.parseInt(scn.nextLine());
    int count=0;
    int a=num;
    while(num>=1){
        num=num/10;
        count++; }
    k=k%count;
    if(k<0){
        k=k+count;}
    if (k==0){
        System.out.print(a);
        return;}    
    for (int i=1;i<=k;i++){
        int digit=a%10;
        a=a/10;
        a=a+digit*(int)Math.pow(10, count-1);   
    }
    System.out.println(a);
  }
}
