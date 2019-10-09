
package biludlejningsopgave;


public class BenzinBil extends Bil {
    
    private int oktantal, kmPrL;
    
    //-------------//
    // CONSTRUCTOR //
    //-------------//
    public BenzinBil(String regNr, int årgang, int antalDøre, String mærke, String model, int oktantal, int kmPrL) {
        super(regNr, årgang, antalDøre, mærke, model);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }
    
    //---------//
    // GETTERS //
    //---------//

    public int getOktantal() {
        return oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }
    
    //---------//
    // SETTERS //
    //---------//

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }
    
    //---------//
    // METHODS //
    //---------//
    
    @Override
    public String toString() {
        // eksempel output:
        // Renault Espace, årgang 2017, 5 døre, registreringsnummer: AB12345, oktantal: 98, 12km pr. liter
        return super.toString() + ", oktantal: " + oktantal + ", " + kmPrL + "km pr. liter";
    }

    @Override
    public double beregnGrønEjerafgift() {
        //afhænger af km pr. liter.
        //hvis mellem over 20, 330kr
        //hvis mellem 15 og 20, 1050kr
        //hvis mellem 10 og 15, 2340kr
        //hvis mellem 5 og 10, 5500kr
        //hvis under 5, 10470kr
        
        if (kmPrL > 20) {
            return 330.0;
        } else if (kmPrL > 15) {
            return 1050.0;
        } else if (kmPrL > 10) {
            return 2340;
        } else if (kmPrL > 5) {
            return 5500;
        } else if (kmPrL > 0 ) {
            return 10470;
        } else {
            return -1;
        }
    }
}
