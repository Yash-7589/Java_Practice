import java.util.ArrayList;
import java.util.Scanner;

public class Combine_Arraylist {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<String> name=new ArrayList<String>();
        ArrayList<String> surname=new ArrayList<String>();
        ArrayList<String> fullname=new ArrayList<String>();
        for(int i=0;i<5;i++){
            System.out.print("Enter first name: ");
            name.add(sc.nextLine());
        }
        for(int i=0;i<5;i++){
            System.out.print("Enter last name: ");
            surname.add(sc.nextLine());
        }
        for(int i=0;i<name.size();i++){
            fullname.add(name.get(i)+" "+surname.get(i));
        }
        System.out.println("The full name array is:"+ fullname);

        sc.close();
    }
}
