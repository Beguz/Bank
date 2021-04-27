
package bankozas;

public class BankKartya {
    protected int egyenleg;
    private static double KAMAT;
    
    public BankKartya(){
    }
        
    public BankKartya (int kp) {
        if (kp<0){
            this.egyenleg=0;
        }
        this.egyenleg=kp;
    }
    public void setEgyenleg(int penz){
        if(penz>0){
        this.egyenleg=penz;
        }
    }
    public int getEgyenleg(){
        return this.egyenleg;
    }
    
    public  void setKAMAT(double kamat){
        if(kamat<0){
            return;
        }
        BankKartya.KAMAT=kamat;
    }
    public double getKAMAT(){
        return BankKartya.KAMAT;
    }
    
    public boolean kivesz(int osszeg) {
        if(osszeg<0){
            return false;
        }
        if (this.egyenleg>=osszeg){
        this.egyenleg-=osszeg;
        return true;
        }
        return false;
    }
    public void betesz(int osszeg) {
        if(osszeg<0){
            return;
        }
        this.egyenleg+=osszeg;
    }

        public void kamatozik(){
            this.egyenleg+=Math.round(this.egyenleg*(KAMAT/12)*0.01);
            
        }
        
        
}