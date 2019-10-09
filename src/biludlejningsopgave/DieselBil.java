
package biludlejningsopgave;


public class DieselBil extends Bil {
    private int kmPrL;
    private boolean harPartikelfilter;
    
    //-------------//
    // CONSTRUCTOR //
    //-------------//
    public DieselBil(String regNr, int årgang, int antalDøre, String mærke, String model, int kmPrL, boolean harPartikelfilter) {
        super(regNr, årgang, antalDøre, mærke, model);
        this.kmPrL = kmPrL;
        this.harPartikelfilter = harPartikelfilter;
    }
    
    //---------//
    // GETTERS //
    //---------//

    public int getKmPrL() {
        return kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }
    
    //---------//
    // SETTERS //
    //---------//

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }
    
    //---------//
    // METHODS //
    //---------//
    
    @Override
    public String toString() {
        // eksempel output:
        // Renault Espace, årgang 2017, 5 døre, registreringsnummer: AB12345, 15km pr. liter, har partikelfilter: false
        return super.toString() + ", " + kmPrL + "km pr. liter, har partikelfilter: " + harPartikelfilter;
    }

    @Override
    public double beregnGrønEjerafgift() {
        //afhænger af km pr. liter, 
        //plus en udligningsafgift baseret på km pr. liter:
        //hvis mellem over 20, 330kr + 130kr
        //hvis mellem 15 og 20, 1050kr + 1390kr
        //hvis mellem 10 og 15, 2340kr + 1850kr
        //hvis mellem 5 og 10, 5500kr + 2770kr
        //hvis under 5, 10470kr + 15260kr
        //1000kr afgift også inkluderet hvis manglende partikelfilter
        
        double partikeludligningsafgift;
        if(harPartikelfilter) {
            partikeludligningsafgift = 0;
        } else {
            partikeludligningsafgift = 1000;
        }
        
        if (kmPrL > 20) {
            return 330.0 + 130.0 + partikeludligningsafgift;
        } else if (kmPrL > 15) {
            return 1050.0 + 1390.0 + partikeludligningsafgift;
        } else if (kmPrL > 10) {
            return 2340 + 1850.0 + partikeludligningsafgift;
        } else if (kmPrL > 5) {
            return 5500 + 2770.0 + partikeludligningsafgift;
        } else if (kmPrL > 0 ) {
            return 10470 + 15260 + partikeludligningsafgift;
        } else {
            return -1;
        }
    }
}
