
package praktek02;

public class tvaksi {
    public static void main(String[] args) {
        tv tv1 = new tv();
        tv1.hargatv = 15000000;
        tv1.jumlahtv= 10;
        
        tv1.nonton();
        System.out.println(" total pembayaran ="+tv1.totalharga());
        tv1.menonton();
        
        
    }
}
