
import java.util.*;
public class BenjaminBulbs{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter your no.");
        int num=Integer.parseInt(scn.nextLine().trim());
        System.out.println("The switches turned on are:");
        for (int i=1;i*i<=num;i++){
            System.out.println(i*i);
        }
    }
}
