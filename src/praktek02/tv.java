
package praktek02;


public class tv {
    Integer hargatv;
    Integer jumlahtv;
    
   void nonton() {
        System.out.println(" hargatv : "+hargatv);
        System.out.println(" jumlahtv : "+jumlahtv);
        
    }
    
   Integer totalharga () {
       Integer total;
       total = hargatv * jumlahtv;
       return total;
   }
   
   void nonton() {
       System.out.println("total pembayaran: "+totalharga());
       tv1.nonton();
   }
}
