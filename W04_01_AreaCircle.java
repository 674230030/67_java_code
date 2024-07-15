import java.util.Scanner; // นำเข้าคลาส Scanner จาก  java.util
public class W04_01_AreaCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // สร้างอ็อบเจ็กต์ของคลาส Scanner
        System.out.println("ป้อนค่ารัศมีของวงกลม: "); // แสดงข้อความที่ให้ผู้ใช้ป้อนค่ารัสมี
        double radius = sc.nextDouble(); //รับค่ารัสมีจากผู้ใช้และเก็บค่าตัวแปรใน radius

        // double radius; // ประกาศตัวแปรเก็บรัศมี
        // radius = 34; // กำหนดค่ารัศมีมีค่าเป็น 10

        double area; // ประกาศตัวแปรเก็บค่าพื้นที่
        double PI = 3.14159; // ประกาศค่าคงที่ PI
        
        area = PI*radius*radius; // คำนวนพื้นที่ของวงกลม
        System.out.println("พื้นที่ของวงกลมที่มีรัศมีเท่ากับ"+radius+" คือ "+area);
    }
}