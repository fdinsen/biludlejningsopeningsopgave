
package biludlejningsopgave;


public abstract class Bil {
    private int årgang, antalDøre;
    private String regNr, mærke, model;
    
    //-------------//
    // CONSTRUCTOR //
    //-------------//
    public Bil(String regNr, int årgang, int antalDøre, String mærke, String model) {
        this.regNr = regNr;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
        this.mærke = mærke;
        this.model = model;
    }
    
    //---------//
    // GETTERS //
    //---------//

    public String getRegNr() {
        return regNr;
    }

    public int getÅrgang() {
        return årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public String getMærke() {
        return mærke;
    }

    public String getModel() {
        return model;
    }
    
    //---------//
    // SETTERS //
    //---------//

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    //---------//
    // METHODS //
    //---------//
    
    @Override
    public String toString() {
        // eksempel output:
        // Renault Espace, årgang 2017, 5 døre, registreringsnummer: AB12345
        return mærke + " " + model + ", årgang " + årgang + ", " + antalDøre + " døre, registreringsnummer: " + regNr;
    }
    
    public abstract double beregnGrønEjerafgift();
}
