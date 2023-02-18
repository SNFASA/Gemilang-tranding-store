import java.util.Scanner;
public class Gemilang_Trading_Store{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price = RM  ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity purchased = ");
        int qty = sc.nextInt();
        double total ;
        total = price * qty ; 
        if (qty >= 5)
            total = price * qty * 0.9;
        System.out.println("Total Price = RM " + total);
        
    }
    
}