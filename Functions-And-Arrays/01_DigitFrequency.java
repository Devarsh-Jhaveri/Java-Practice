import java.util.*;
class DigitFrequency {
    public static int getfreq(int n, int d){
        if(n==0){
            return d==0?1:0;
        }
        int count=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            if(digit==d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your no.");
        int n=Integer.parseInt(scn.nextLine());
        System.out.println("Enter which digit's frequency you wanna see");
        int d=Integer.parseInt(scn.nextLine());
        int freq=getfreq(n,d);
        System.out.println(freq+" is frequency");
    }
}
