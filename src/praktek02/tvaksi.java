
package praktek02;

public class tvaksi {
    public static void main(String[] args) {
        tv tv1 = new tv();
        tv1.hargatv = 15000000;
        tv1.jumlahtv= 10;
        
        tv1.nonton();
        System.out.println(" total pembayaran ="+tv1.totalharga());
        tv1.menonton();
        
        tv tv2 = new tv();
        tv2.nonton();
        
        tv tv3 = new tv(1500000,10);
        tv3.nonton();
    }
}
