public class W03_03_NetPrice{
    public static void main(String [] args){
        //สร้างตัวแปรเพื่อเก็บค่าของแต่ละอย่าง
        short price = 350;
        byte quantity =10;
        byte percentDiscount = 5;

        int totalPrice = price * quantity;

        int discount = totalPrice *  percentDiscount / 100;

        int netPrice = totalPrice - discount;
        System.out.println("Total Price = "+( totalPrice));
        System.out.println("Discount = " + ( discount));
        System.out.println("NetPrice = " + ( netPrice));
        
        
    }
}
