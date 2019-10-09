package biludlejningsopgave;

public class ElBil extends Bil {

    private int batterikapacitetKWh, maxKm, whPrKm;

    //-------------//
    // CONSTRUCTOR //
    //-------------//
    public ElBil(String regNr, int årgang, int antalDøre, String mærke, String model, int batterikapacitetKWh, int maxKm) {
        super(regNr, årgang, antalDøre, mærke, model);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        //wattTimer pr. km udregnes ved at omregne kapaciteten til wattimer,
        // og diviere med rækkevidden: 
        udregnWhPrKm();
    }

    //---------//
    // GETTERS //
    //---------//
    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    //---------//
    // SETTERS //
    //---------//
    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    //---------//
    // METHODS //
    //---------//
    @Override
    public String toString() {
        // eksempel output:
        // Renault Espace, årgang 2017, 5 døre, registreringsnummer: AB12345, batterikapacitet: 42 kWh, rækkevidde: 300km, 140wh pr. km
        return super.toString() + ", batterikapacitet: " + batterikapacitetKWh + " kWh, rækkevidde: " + maxKm + "km, " + whPrKm + "wh pr. km";
    }

    @Override
    public double beregnGrønEjerafgift() {
        //afhænger af km pr. liter.
        //watt pr. liter skal omregnes til km pr. liter,
        //ved formel set i omregnTilKmPrL()
        
        //hvis mellem over 20, 330kr
        //hvis mellem 15 og 20, 1050kr
        //hvis mellem 10 og 15, 2340kr
        //hvis mellem 5 og 10, 5500kr
        //hvis under 5, 10470kr
        
        int kmPrL = (int) omregnTilKmPrL();

        if (kmPrL > 20) {
            return 330.0;
        } else if (kmPrL > 15) {
            return 1050.0;
        } else if (kmPrL > 10) {
            return 2340;
        } else if (kmPrL > 5) {
            return 5500;
        } else if (kmPrL > 0) {
            return 10470;
        } else {
            return -1;
        }
    }

    private double omregnTilKmPrL() {
        // Divider watt pr. km med 91,25, og divider 100 med det tal
        return 100 / (whPrKm / 91.25);
    }
    
    private void udregnWhPrKm() {
        this.whPrKm = (int) Math.round( (batterikapacitetKWh * 1000.0) / maxKm);
    }
}
