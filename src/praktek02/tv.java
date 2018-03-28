
package praktek02;


public class tv {
    Integer hargatv;
    Integer jumlahtv;

    public tv() {
        hargatv = 15000000;
        jumlahtv= 10;
    }

    public tv(Integer hargatv, Integer jumlahtv) {
        this.hargatv = hargatv;
        this.jumlahtv = jumlahtv;
    }
    
    
    
   void nonton() {
        System.out.println(" hargatv : "+hargatv);
        System.out.println(" jumlahtv : "+jumlahtv);
        
    }
    
   Integer totalharga () {
       Integer total;
       total = hargatv * jumlahtv;
       return total;
   }
   
   void menonton() {
       System.out.println("total pembayaran: "+totalharga());
   }
}
