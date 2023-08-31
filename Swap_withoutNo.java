public class Swap_withoutNo {
        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;
    
            System.out.println("before swap");
            System.out.println("a= "+num1);
            System.out.println("b= "+num2);
    
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
    
            System.out.println("after swap");
            System.out.println("a= "+num1);
            System.out.println("b= "+num2);
    
    
           
        }
}
