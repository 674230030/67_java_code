package W10;
import java.util.Scanner;
public class W10_04_titleStatus{
    public static void main(String[] args){
        Scanner Kb = new Scanner(System.in);

        System.out.print("ระบุเพศ (male/female): ");
        String gender = Kb.next();

        System.out.print("ระบุอายุ: ");
        int age = Kb.nextInt();

        System.out.print("สถานะสมรส (single/married): ");
        String isMarried = Kb.next();

        //ตรวจสอบเงื่อนไข
        if(gender.equalsIgnoreCase("male")){
            // ถ้าเป็นผู้ชาย => ด.ช. นาย
            if(age < 15){
                System.out.println("ด.ช.");

            }else{
                System.out.println("นาย");

            }

        }else{
            // ถ้าเป็นผู้หญิง => ด.ญ. นาง นางสาว
            if(age < 15){
                System.out.println("ด.ญ.");
            }else if(isMarried.equalsIgnoreCase("married")){
                System.out.println("นาง");

            }else{
                System.out.println("นางสาว");
            }

        }
    }
}