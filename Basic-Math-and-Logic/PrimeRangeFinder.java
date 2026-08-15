import java.util.Scanner;

public class PrimeRangeFinder {

public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        //Q) PRINT PRIME NOS IN A RANGE
        System.out.println("Give lower range");
        int low=Integer.parseInt(scan.nextLine());
        System.out.println("Give higher range");
        int high=Integer.parseInt(scan.nextLine());
        for (int i=low; i<=high; i++){
            if (i<=1){
                continue;
            }
            int count=0;
            for(int div=2; div*div<=i;div++){

                if (i%div==0){
                    count++;
                    break; }
            }
            if (count==0){
                System.out.println(i+" is a prime no.");
            }
        }
    }
}
