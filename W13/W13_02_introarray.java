package W13;

import java.util.Scanner;

public class W13_02_introarray {
    public static void main(String[] args) {
          // ประกาศตัวแปรชนิด array แบบที่2 - ไม่รู้จำนวนข้อมูลข้างหน้า
          String [] brandsCars = new String[3];

          Scanner kb = new Scanner(System.in);

          // กำหนดค่าให้กับ array
          brandsCars[0] = "ToYota";
          brandsCars[1] = "Honda";
          brandsCars[2] = "Nissan";

          // แสดงผลลัพธ์โดยใช้ loop
            System.out.println("Old Brand of cars in the array are");
            for (int i = 0; i < brandsCars.length; i++){
            System.out.print(brandsCars[i] + " / ");
            }
        
            // แก้ไขค่าใน array โดยรับต่าจากคีย์บอร์ด
            System.out.println("\n\nPlease enter the brand of the 3rd car");
            for (int i=0; i < brandsCars.length ; i++){
                System.out.println("Enter brand" + (i+1) + ": ");
                brandsCars[i] = kb.next();

            }
            
            brandsCars[3] = "BMW";
            System.out.println("Brand of cars in the array are");
            for (String car : brandsCars){
            System.out.print(car + " / ");
            }
            
            
    }
    
}
