import java.util.Scanner;
public class W05_02_ifElseIf_PosNegZero {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number");

        int number = kb.nextInt();
       
        if(number > 0){
            System.out.println("is a positive number. ");

        }else if(number < 0){
            System.out.println("is a nagative number. ");

        }else if(number == 0){
            System.out.println("is zoro. ");
        }else{
            System.out.println("Invalid input. ");
        }
}
}