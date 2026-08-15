import java.util.Scanner;

public class PrimeNumberChecker {
    //Q) CHECK PRIME/NOT PRIME NO.
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("How many nos do you wanna check?");
        int t=Integer.parseInt(scan.nextLine());
        for (int i=0; i<t; i++){
            System.out.println("Please enter the no.");
            int n=Integer.parseInt(scan.nextLine());
            int count=0;  
            for (int div=2; div*div<=n; div++){   
                if (n%div==0){
                    count++;
                    break;
                }
               }
            
            if (count==0){
                System.out.println("Prime");
            }
            else {System.out.println("Not prime");} 
            } 
}
}
