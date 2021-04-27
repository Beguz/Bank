
package bankozas;

public class Ugyfel {
    private String nev;
    private int fizetes;
    public Ugyfel(String nev,int fizetes){
        if(nev!=null){
        this.nev=nev;
            if (fizetes<0) {
                this.fizetes=0;
                return;
            }
this.fizetes=fizetes;
        }
    }
    public void setNev(String nev) {
        this.nev=nev;
    }
    public void setFizetes(int fizetes) {
        if (fizetes<0) {
            this.fizetes=0;
            return;
        }
        this.fizetes=fizetes;
        }
    public String getNev() {
        return this.nev;
    }
    public int getFizetes() {
        return this.fizetes;
    }
    
}
