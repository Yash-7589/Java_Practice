import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        long a=0;
        int m=n;
        while(n!=0){
            int num=n%2;
            a=(a*10)+num;
            n/=2;
        }
        while(a!=0){
            System.out.print(a%10);
            a/=10;
        }
        if(m%2==0)
            System.out.println(0);
    }
}
