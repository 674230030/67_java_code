package W10;
import java.util.Scanner;
public class W10_03_login{
    public static void main(String[] args){
        // สร้างตัวแปรเก็บ username และ password
        String Username = "Suthathip";
        String Password = "674230030";

        Scanner Kb = new Scanner(System.in);
        // สร้างตัวแปรเก็บ username และ password ที่ผู้ใช้ป้อนเข้ามา
        System.out.print("ป้อนชื่อผู้ใช้: ");
        String inputUsername = Kb.nextLine();

        System.out.print("ป้อนรหัสผ่าน: ");
        String inputPassword = Kb.nextLine();

        // ตรวจสอบเงื่อนไข
        if(Username.equals(inputUsername) && Password.equals(inputPassword)){
            System.out.println("เข้าสู่ระบบสำเร็จ");
  
        }else{
            if(!Username.equals(inputUsername) && Password.equals(inputPassword)){
                System.out.println("ชื่อผู้ใช้ไม่ถูกต้อง");

            }else if (Username.equals(inputUsername) && !Password.equals(inputPassword)){
                 System.out.println("รหัสผ่านไม่ถุกต้อง");

            }else{
                System.out.println("ชื่อผู้ใช้และรหัสผ่านไม่ถูกต้อง");
            }

        }
    }
}