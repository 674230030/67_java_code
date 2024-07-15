import java.util.Scanner;
public class W04_02_ifElse_compareNumber {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
         System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int result = 0;

        if(num1>num2){
                result = num1-num2;
                System.out.println("The number 1 is greater than the num 2");
        } else {
                result = num1+num2;
                System.out.println("The number 1 is less or equal the num 2");
        }
        System.out.println("The result is:" + result );

    }
}