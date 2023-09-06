import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        int sum=0,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        while(n!=0){
            int num=n%10;
            sum+=num;
            rev=(rev*10)+num;
            n=n/10;

        }
        System.out.println("Sum of Numbers: "+sum);
        System.out.println("reverse Number is: "+rev);
    }
}
