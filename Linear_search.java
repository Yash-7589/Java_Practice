import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elemnet:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search in the array:");
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                System.out.println("Number "+ m+" is at index "+ i);
            }
        }
    }
}
