package biludlejningsopgave;


public class Biludlejningsopgave {

    public static void main(String[] args) {
        Garage bilpark = new Garage();
        
        bilpark.tilføjBil(new BenzinBil("MD21233", 2019, 5, "Audi", "A5", 98, 19) );
        bilpark.tilføjBil(new BenzinBil("YU57648", 2018, 5, "Mazda", "2", 95, 22) );
        bilpark.tilføjBil(new BenzinBil("HF38663", 2011, 5, "Ford", "Focus", 95, 15) );
        bilpark.tilføjBil(new DieselBil("DG42913", 2018, 5, "Seat", "Leon", 22, true));
        bilpark.tilføjBil(new DieselBil("TN32971", 1983, 3, "Volkswagen", "Golf I", 16, false));
        bilpark.tilføjBil(new ElBil("AS20515", 2012, 5, "Nissan", "Leaf", 24, 178));
        bilpark.tilføjBil(new ElBil("MORS DYT", 2020, 2, "Tesla", "Roadster", 200, 1000));
        
        
        System.out.println(bilpark.toString());
        
        System.out.println("Total afgift for alle biler: " + bilpark.beregnGrønAfgiftForBilpark() );
        
        // Printer ejerafgiften for hver enkel bil
        /*for(int i = 0; i < bilpark.getGarageSize() ; i++) {
            Bil tempBil = bilpark.getBilAt(i);
            System.out.println("Bil: "+ tempBil.getMærke() + "Ejerafgift: " + tempBil.beregnGrønEjerafgift());
        } */
        
        // Printer hver del i udregningen af Wh pr km udregningen, så den kan eftertjekkes
        /*ElBil tempBil2 = (ElBil) bilpark.getBilAt(5);
        System.out.println("Kapacitet: " + tempBil2.getBatterikapacitetKWh());
        System.out.println("Rækkevidde: " + tempBil2.getMaxKm());
        System.out.println("Watt pr. km: " + tempBil2.getWhPrKm()); */
        
        // Laver en bil med en km pr. liter på under 0, for at tjekke fejlhåndteringen i garagen.
        /*bilpark.tilføjBil(new BenzinBil("TE5781L", 1980, 3, "Matra", "Murena", 95, -15));
        System.out.println("Total afgift for alle biler: " + bilpark.beregnGrønAfgiftForBilpark() ); */
    }

}
