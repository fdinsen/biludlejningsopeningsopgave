
package biludlejningsopgave;

import java.util.ArrayList;


public class Garage {
    private ArrayList<Bil> garage = new ArrayList<Bil>();
    
    
    //---------//
    // GETTERS //
    //---------//
    public int getGarageSize() {
        return garage.size();
    }
    
    public Bil getBilAt(int index) {
        return garage.get(index);
    }
    
    //---------//
    // METHODS //
    //---------//
    
    public void tilføjBil(Bil bil) {
        garage.add(bil);
    }
    
    public int beregnGrønAfgiftForBilpark() {
        int totalAfgift = 0;
        for (Bil bil : garage) {
            // Tjekker hvis en af bilerne returnerer en fejl i deres ejerafgift.
            if (bil.beregnGrønEjerafgift() == -1 ) {
                return -1;
            }
            
            totalAfgift += bil.beregnGrønEjerafgift();
        }
        return totalAfgift;
    }
    
    
    @Override
    public String toString() {
        String output = "";
        for (Bil bil : garage) {
            output += bil.toString() + "\n";
        }
        return output;
    }
}
