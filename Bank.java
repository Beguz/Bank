
package bankozas;

public class Bank {
    public static BankKartya ujBankKartya(Ugyfel u){        
        if (u.getFizetes()<150000){
        return new BankKartya(u.getFizetes());
        }else{
      HitelKartya uj= new HitelKartya(u.getFizetes(),u.getFizetes()*2);
      
        return uj;
        }
    }
}
