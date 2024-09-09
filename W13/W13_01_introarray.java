package W13;
public class W13_01_introarray {
    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด array แบบที่1 - ไม่รู้จำนวนข้อมูลข้างหน้า
        String[] Colors = {"Purple", "Cyan", "Blue", "Green", "Yelloe", "Orange", "Red",};
        int [] banks = {20, 50, 100, 500, 1000,};
        char []  alphabet ={'a', 'b', 'c', 'd', 'e',};

        // แสดงผลลัพธ์ดดยใช้ index ของ array
        System.out.println("The first color is" + Colors [0] );
        System.out.println("The Third alphabet is "+ alphabet [2]);

        // แสดงผลลัพธ์โดยใช้ Loop
        System.out.println("----------------------------------------");
        System.out.println("Colors in the array are:");
        for (int i = 0; i <7; i++){
            System.out.print(Colors[i] + " ");
        }
        System.out.println("");
        System.out.println("-----------------------------------------");
        for (int i = 6; i > -1; i--){
            System.out.print(Colors[i] + " ");

        }
          System.out.println("");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < banks.length; i++){
            System.out.print(banks[i] + " ");

        }
    }
}
    
