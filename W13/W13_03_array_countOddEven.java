package W13;

public class W13_03_array_countOddEven {
    public static void main(String[] args) {
        // ให้นับจำนวนเลขคู่และเลขคี่ใน array ด้านล่าง
        int [] number = {1, 5, 9, 12, 19, 25, 30, 39, 42, 49, 50, 55, 56, 60,};

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
            if(number [i] % 2 == 0){
                // ใส่เงื่อนไขเพื่อนับจำนวนเลขคู่และเลขคี่
                countEven++;
            }else{
                // ใส่เงื่อนไขเพื่อนับจำนวนเลขคู่และเลขคี่
                countOdd++;
            }
           
        }
         System.out.println("\n Amount of all Number : " + number.length);
         System.out.println(" Amount of Odd Number : " + countOdd);
         System.out.println(" Amount of Even Number : " + countEven);

        
    }
}
