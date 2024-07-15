import java.util.Scanner;
public class W05_01_ifElse_OddEvenNumber {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       
        System.out.print("Enter a number: "); 
        
        int number = kb.nextInt();
        int result = number % 2;
    
    if(result!=0){
        System.out.println( "is an even number. ");
    }else{
        System.out.println("is an odd number. ");
    }
    }
}