
package bankozas;

public class HitelKartya extends BankKartya{
    private int hitelkeret;
    private static double  HITELKAMAT;
    public HitelKartya(){
    }
    public HitelKartya(int penz){
        super(penz);
    }
          
        
        
        public HitelKartya(int le,int hit){
            super(le);
            if(hit<0){
                this.hitelkeret=0;
                return;
            }
            this.hitelkeret=hit;
        }
    public  void setHITELKAMAT(double kamat){
        if(kamat<0){
            return;
        }
        HitelKartya.HITELKAMAT=kamat;
    }
    public double getHITELKAMAT(){
        return HitelKartya.HITELKAMAT;
    }
    
    
    
    @Override
    public boolean kivesz(int osszeg) {
        if(osszeg<0){
            return false;
        }
        if(this.egyenleg+this.hitelkeret>=osszeg) {
            egyenleg-=osszeg;
            return true;
        }
        return false;
    }
     @Override
      public void betesz(int osszeg) {
          if(osszeg>=0){
          this.egyenleg+=osszeg;
          }
    }
     @Override
      public void kamatozik(){
          if(this.egyenleg>=0){
              this.egyenleg+=Math.round(this.egyenleg*(getKAMAT()/12)*0.01);
              return;
          }
          this.egyenleg+=Math.round(this.egyenleg*(HITELKAMAT/12)*0.01);
            
        }
      public void setHitelkeret(int keret){
          if (keret<0) {
              return;
          }
          this.hitelkeret=keret;
      }
      public int getHitelkeret(){
         return this.hitelkeret;
      }
}
